package room.inteligent.things.android.cuartointeligente.presentation.views

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import room.inteligent.things.android.cuartointeligente.R
import room.inteligent.things.android.cuartointeligente.presentation.BaseActivity
import room.inteligent.things.android.cuartointeligente.presentation.presenters.MainPresenter
import javax.inject.Inject

class MainActivity : BaseActivity() ,MainPresenter.View{


    @Inject lateinit var mPresenter: MainPresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mPresenter.context(this)
        mPresenter.obtenerEstado()

        button.setOnClickListener({
            if(button.text.toString() == resources.getString(R.string.apagar_foco)){
                mPresenter.cambiarEstado("focoUno",false)
            }else{
                mPresenter.cambiarEstado("focoUno",true)
            }
        })

    }

    override val layout: Int get() = R.layout.activity_main

    override fun showProgress() {
    }

    override fun hideProgress() {
    }

    override fun showMessage(title: String, message: String) {
    }

    override fun showButtonText(text: String) {
        button.text = text
    }


}
