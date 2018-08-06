package room.inteligent.things.android.cuartointeligente

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

/**
 * Cuarto Inteligente
 * Creado por Carlos Ugaz on 8/4/18.
 */
open class App : DaggerApplication(){

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().create(this)
    }

}