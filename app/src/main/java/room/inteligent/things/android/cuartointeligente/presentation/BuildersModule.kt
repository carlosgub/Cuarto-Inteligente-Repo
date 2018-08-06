package room.inteligent.things.android.cuartointeligente.presentation

import dagger.Module
import dagger.android.ContributesAndroidInjector
import room.inteligent.things.android.cuartointeligente.presentation.views.MainActivity


/**
 * Cuarto Inteligente
 * Creado por Carlos Ugaz on 8/4/18.
 */
@Module
abstract class BuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeMainActivityInjector(): MainActivity


}