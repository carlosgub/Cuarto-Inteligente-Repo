package room.inteligent.things.android.cuartointeligente.presentation


import dagger.Binds
import dagger.Module
import room.inteligent.things.android.cuartointeligente.presentation.presenters.MainPresenter
import room.inteligent.things.android.cuartointeligente.presentation.views.MainActivity

/**
 * Cuarto Inteligente
 * Creado por Carlos Ugaz on 8/4/18.
 */
@Module
abstract class BindingModule {

    @Binds abstract fun provideMainView(activity: MainActivity): MainPresenter.View

}