package room.inteligent.things.android.cuartointeligente

import android.content.Context
import dagger.Module
import dagger.Provides

/**
 * Cuarto Inteligente
 * Creado por Carlos Ugaz on 8/4/18.
 */
@Module
class AppModule {

    /**
     * App Context
     */

    @Provides fun provideContext(app: App): Context = app

}
