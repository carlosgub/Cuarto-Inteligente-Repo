package room.inteligent.things.android.cuartointeligente.presentation.views

import android.os.Bundle
import android.view.View
import android.view.WindowManager
import com.google.android.things.pio.Gpio
import com.google.android.things.pio.PeripheralManager
import kotlinx.android.synthetic.main.activity_main.*
import room.inteligent.things.android.cuartointeligente.R
import room.inteligent.things.android.cuartointeligente.presentation.BaseActivity
import room.inteligent.things.android.cuartointeligente.presentation.presenters.MainPresenter
import javax.inject.Inject


class MainActivity : BaseActivity() ,MainPresenter.View{


    @Inject lateinit var mPresenter: MainPresenter
    private lateinit var relay:Gpio

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mPresenter.context(this)
        mPresenter.obtenerEstado()
        mPresenter.inicializarPerifericos()

        button.setOnClickListener {
            if(button.text.toString() == resources.getString(R.string.apagar_foco)){
                mPresenter.cambiarEstado("focoUno",false)
            }else{
                mPresenter.cambiarEstado("focoUno",true)
            }
        }

    }

    override val layout: Int get() = R.layout.activity_main

    override fun showProgress() {
        progressBar.visibility = View.VISIBLE
        window.setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
                WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE)
    }

    override fun hideProgress() {
        progressBar.visibility = View.GONE
        window.clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE)
    }

    override fun showButtonText(text: String) {
        button.text = text
    }

}
