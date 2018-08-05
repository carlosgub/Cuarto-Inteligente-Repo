package room.inteligent.things.android.cuartointeligente.presentation.presenters

import io.reactivex.schedulers.Schedulers
import room.inteligent.things.android.cuartointeligente.domain.usecases.GetFocoUseCase
import javax.inject.Inject

/**
 * CorrePalabras
 * Created by ITLAB on 8/4/18.
 */
class MainPresenter @Inject constructor(var view: MainPresenter.View,
                                        private val useCase: GetFocoUseCase){

    fun obtenerEstado(){
        view.showProgress()
        useCase.getEstados()
                .subscribeOn(Schedulers.io())
                .subscribe({
                    if(it.focoUno){
                        view.showButtonText("Apagar Foco")
                    }else{
                        view.showButtonText("Prender Foco")
                    }
                    view.hideProgress()
                })
    }

    interface View {

        fun showProgress()

        fun hideProgress()

        fun showMessage(title: String, message: String)

        fun showButtonText(text:String)
    }

}