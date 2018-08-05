package room.inteligent.things.android.cuartointeligente.presentation

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity


abstract class BaseActivity : DaggerAppCompatActivity() {

    /**
     * The onCreate base will set the view specified in [layout] and will
     * inject dependencies and views.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout)
    }

    /**
     * @return The layout that's gonna be the activity view.
     */
    protected abstract val layout: Int

    /**
     * @return The presenter attached to the activity. This must extends from [BasePresenter]
     */

}