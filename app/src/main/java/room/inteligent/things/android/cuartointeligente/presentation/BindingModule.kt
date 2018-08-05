package room.inteligent.things.android.cuartointeligente.presentation


import dagger.Binds
import dagger.Module
import room.inteligent.things.android.cuartointeligente.presentation.presenters.MainPresenter
import room.inteligent.things.android.cuartointeligente.presentation.views.MainActivity

@Module
abstract class BindingModule {

    @Binds abstract fun provideMainView(activity: MainActivity): MainPresenter.View

}