package room.inteligent.things.android.cuartointeligente.data

import dagger.Binds
import dagger.Module
import room.inteligent.things.android.cuartointeligente.data.repository.LightDataRepository
import room.inteligent.things.android.cuartointeligente.domain.repository.LightRepository

/**
 * Cuarto Inteligente
 * Creado por Carlos Ugaz on 8/4/18.
 */
@Module
abstract class DataModule {

    @Binds abstract fun bindHistoryRepository(repository: LightDataRepository): LightRepository
}