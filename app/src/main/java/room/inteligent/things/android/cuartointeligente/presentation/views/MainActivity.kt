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
        mPresenter.getState()
        mPresenter.initializeRelay()

        button.setOnClickListener {
            if(button.text.toString() == resources.getString(R.string.apagar_foco)){
                mPresenter.changeState("light",false)
            }else{
                mPresenter.changeState("light",true)
            }
        }

    }

    override val layout: Int get() = R.layout.activity_main

    /** Show Progress */
    override fun showProgress() {
        progressBar.visibility = View.VISIBLE

        //Lock the Screen
        window.setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
                WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE)
    }

    /** Hide Progress*/
    override fun hideProgress() {
        progressBar.visibility = View.GONE

        //Unlock the Screen
        window.clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE)
    }

    /** Change the button text */
    override fun setButtonText(text: String) {
        button.text = text
    }

    /** Clear the Observables*/
    override fun onDestroy() {
        super.onDestroy()
        mPresenter.onDestroy()
    }
}
