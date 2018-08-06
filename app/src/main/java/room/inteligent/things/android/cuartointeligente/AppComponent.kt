package room.inteligent.things.android.cuartointeligente


import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import room.inteligent.things.android.cuartointeligente.data.DataModule
import room.inteligent.things.android.cuartointeligente.data.sources.FirebaseModule
import room.inteligent.things.android.cuartointeligente.presentation.BindingModule
import room.inteligent.things.android.cuartointeligente.presentation.BuildersModule

/**
 * Cuarto Inteligente
 * Creado por Carlos Ugaz on 8/4/18.
 */
@Component(modules = arrayOf(
        AppModule::class,
        BuildersModule::class,
        BindingModule::class,
        DataModule::class,
        FirebaseModule::class,
        AndroidSupportInjectionModule::class))

interface AppComponent : AndroidInjector<App> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>()

}