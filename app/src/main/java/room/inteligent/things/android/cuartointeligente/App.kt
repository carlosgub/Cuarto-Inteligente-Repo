package room.inteligent.things.android.cuartointeligente

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

open class App : DaggerApplication(){

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().create(this)
    }

}