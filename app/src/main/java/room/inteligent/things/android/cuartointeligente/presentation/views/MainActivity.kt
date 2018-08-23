package room.inteligent.things.android.cuartointeligente.presentation.views

import android.os.Bundle
import android.view.View
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_main.*
import room.inteligent.things.android.cuartointeligente.R
import room.inteligent.things.android.cuartointeligente.presentation.BaseActivity
import room.inteligent.things.android.cuartointeligente.presentation.presenters.MainPresenter
import javax.inject.Inject

/**
 * Cuarto Inteligente
 * Creado por Carlos Ugaz on 8/4/18.
 */
class MainActivity : BaseActivity() ,MainPresenter.View{


    @Inject lateinit var mPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mPresenter.context(this)
        mPresenter.obtenerEstado()

        button.setOnClickListener {
            if(button.text.toString() == resources.getString(R.string.apagar_foco)){
                mPresenter.cambiarEstado("focoUno",false)
            }else{
                mPresenter.cambiarEstado("focoUno",true)
            }
        }

    }

    override val layout: Int get() = R.layout.activity_main

    /** Mostrar el progress*/
    override fun showProgress() {
        progressBar.visibility = View.VISIBLE

        /** Bloquear la pantalla para que no pueda presionar el boton*/
        window.setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
                WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE)
    }

    /** Ocultar el progress*/
    override fun hideProgress() {
        progressBar.visibility = View.GONE

        /** Desbloquear la pantalla*/
        window.clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE)
    }

    /** Cambiar el boton del texto*/
    override fun setButtonText(text: String) {
        button.text = text
    }

    /** Limpiar los observables*/
    override fun onDestroy() {
        super.onDestroy()
        mPresenter.onDestroy()
    }

}