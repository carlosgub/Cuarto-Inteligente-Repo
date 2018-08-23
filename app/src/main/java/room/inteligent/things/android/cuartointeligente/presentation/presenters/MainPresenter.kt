package room.inteligent.things.android.cuartointeligente.presentation.presenters

import android.content.Context
import com.google.android.things.pio.Gpio
import com.google.android.things.pio.PeripheralManager
import io.reactivex.disposables.CompositeDisposable
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
    private val pin_name = "GPIO2_IO01" //Pin que esta usado en la placa
    private var cd = CompositeDisposable()

    /** Obtener el context del Activity*/
    fun context(context:Context){
        mContext = context
    }

    /** Inicializar el Relay */
    fun inicializarRelay(){
        val manager = PeripheralManager.getInstance()
        relay = manager.openGpio(pin_name)
        relay.setDirection(Gpio.DIRECTION_OUT_INITIALLY_LOW)
        relay.value = false
    }

    /** Obtener el estado actual del foco */
    fun obtenerEstado(){
        view.showProgress()
        cd.add(useCase.getEstado()
                .subscribeOn(Schedulers.io())
                .subscribe {
                    if(it.foco){
                        view.setButtonText(mContext.getString(R.string.apagar_foco))
                    }else{
                        view.setButtonText(mContext.getString(R.string.prender_foco))
                    }
                    relay.value = it.foco
                    view.hideProgress()
                })
    }

    /** Cambiar el estado del boton */
    fun cambiarEstado(child:String,estado:Boolean){
        view.showProgress()
        useCase.cambiarEstado(child,estado)
        if(estado){
            view.setButtonText(mContext.getString(R.string.apagar_foco))
        }else{
            view.setButtonText(mContext.getString(R.string.prender_foco))
        }
        view.hideProgress()
    }

    /** Limpiar los observables*/
    fun onDestroy(){
        cd.clear()
    }

    interface View {

        fun showProgress()

        fun hideProgress()

        fun setButtonText(text:String)
    }

}