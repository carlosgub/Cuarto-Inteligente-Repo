package room.inteligent.things.android.cuartointeligente.presentation

import dagger.Module
import dagger.android.ContributesAndroidInjector
import room.inteligent.things.android.cuartointeligente.presentation.views.MainActivity


@Module
abstract class BuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeMainActivityInjector(): MainActivity


}