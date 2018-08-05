package room.inteligent.things.android.cuartointeligente.data

import dagger.Binds
import dagger.Module
import room.inteligent.things.android.cuartointeligente.data.repository.FocoDataRepository
import room.inteligent.things.android.cuartointeligente.domain.repository.FocoRepository

/**
 * CorrePalabras
 * Created by ITLAB on 8/5/18.
 */
@Module
abstract class DataModule {

    @Binds abstract fun bindHistoryRepository(repository: FocoDataRepository): FocoRepository
}