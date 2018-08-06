package room.inteligent.things.android.cuartointeligente.presentation.presenters

import android.content.Context
import com.google.android.things.pio.Gpio
import com.google.android.things.pio.PeripheralManager
import io.reactivex.schedulers.Schedulers
import room.inteligent.things.android.cuartointeligente.R
import room.inteligent.things.android.cuartointeligente.domain.usecases.GetFocoUseCase
import javax.inject.Inject

/**
 * Cuarto Inteligente
 * Creado por Carlos Ugaz on 8/4/18.
 */
class MainPresenter @Inject constructor(var view: MainPresenter.View,
                                        private val useCase: GetFocoUseCase){

    lateinit var mContext:Context
    lateinit var relay:Gpio
    private val pin_name = "GPIO2_IO01"

    fun context(context:Context){
        mContext = context
    }

    fun obtenerEstado(){
        view.showProgress()
        useCase.getEstados()
                .subscribeOn(Schedulers.io())
                .subscribe({
                    if(it.focoUno){
                        view.showButtonText(mContext.getString(R.string.apagar_foco))
                    }else{
                        view.showButtonText(mContext.getString(R.string.prender_foco))
                    }
                    relay.setValue(it.focoUno)
                    view.hideProgress()
                })
    }

    fun inicializarPerifericos(){
        val manager = PeripheralManager.getInstance()
        relay = manager.openGpio(pin_name)
        relay.setDirection(Gpio.DIRECTION_OUT_INITIALLY_LOW)
        relay.setValue(false)
    }

    fun cambiarEstado(child:String,estado:Boolean){
        view.showProgress()
        useCase.cambiarEstado(child,estado)
        if(estado){
            view.showButtonText(mContext.getString(R.string.apagar_foco))
        }else{
            view.showButtonText(mContext.getString(R.string.prender_foco))
        }
        view.hideProgress()
    }

    interface View {

        fun showProgress()

        fun hideProgress()

        fun showButtonText(text:String)
    }

}