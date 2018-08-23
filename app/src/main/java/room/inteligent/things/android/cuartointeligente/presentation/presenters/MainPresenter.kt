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
    private val pin_name = "GPIO2_IO01"
    private var cd = CompositeDisposable()

    /** Get the context of the Activity */
    fun context(context:Context){
        mContext = context
    }

    /** Get the current state of the light */
    fun getState(){
        view.showProgress()
        cd.add(useCase.getState()
                .subscribeOn(Schedulers.io())
                .subscribe {

                    if(it.light){
                        view.setButtonText(mContext.getString(R.string.apagar_foco))
                    }else{
                        view.setButtonText(mContext.getString(R.string.prender_foco))
                    }
                    relay.value = it.light
                    view.hideProgress()
                })
    }

    /** Initialize the Relay*/
    fun initializeRelay(){
        val manager = PeripheralManager.getInstance()
        relay = manager.openGpio(pin_name)
        relay.setDirection(Gpio.DIRECTION_OUT_INITIALLY_LOW)
        relay.value = false
    }

    /** Change the state of the light */
    fun changeState(child:String, state:Boolean){
        view.showProgress()
        useCase.changeState(child,state)
        if(state){
            view.setButtonText(mContext.getString(R.string.apagar_foco))
        }else{
            view.setButtonText(mContext.getString(R.string.prender_foco))
        }
        view.hideProgress()
    }

    /** Function for clear the observables */
    fun onDestroy(){ cd.clear() }

    interface View {

        fun showProgress()

        fun hideProgress()

        fun setButtonText(text:String)
    }

}