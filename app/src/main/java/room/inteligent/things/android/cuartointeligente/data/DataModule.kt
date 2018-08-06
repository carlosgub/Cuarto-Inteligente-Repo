package room.inteligent.things.android.cuartointeligente.data

import dagger.Binds
import dagger.Module
import room.inteligent.things.android.cuartointeligente.data.repository.FocoDataRepository
import room.inteligent.things.android.cuartointeligente.domain.repository.FocoRepository

/**
 * Cuarto Inteligente
 * Creado por Carlos Ugaz on 8/4/18.
 */
@Module
abstract class DataModule {

    @Binds abstract fun bindHistoryRepository(repository: FocoDataRepository): FocoRepository
}