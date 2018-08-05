package room.inteligent.things.android.cuartointeligente.presentation.presenters

import android.content.Context
import io.reactivex.schedulers.Schedulers
import room.inteligent.things.android.cuartointeligente.R
import room.inteligent.things.android.cuartointeligente.domain.usecases.GetFocoUseCase
import javax.inject.Inject

/**
 * CorrePalabras
 * Created by ITLAB on 8/4/18.
 */
class MainPresenter @Inject constructor(var view: MainPresenter.View,
                                        private val useCase: GetFocoUseCase){

    lateinit var mContext:Context

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
                    view.hideProgress()
                })
    }

    fun cambiarEstado(child:String,estado:Boolean){
        view.showProgress()
        useCase.cambiarEstado(child,estado)
        if(estado){
            view.showButtonText(mContext.getString(R.string.apagar_foco))
        }else{
            view.showButtonText(mContext.getString(R.string.prender_foco))
        }
    }

    interface View {

        fun showProgress()

        fun hideProgress()

        fun showMessage(title: String, message: String)

        fun showButtonText(text:String)
    }

}