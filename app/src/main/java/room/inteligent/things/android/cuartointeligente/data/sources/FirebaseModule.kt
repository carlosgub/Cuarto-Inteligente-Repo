package room.inteligent.things.android.cuartointeligente.data.sources

import com.google.firebase.database.FirebaseDatabase
import dagger.Module
import dagger.Provides

/**
 * Cuarto Inteligente
 * Creado por Carlos Ugaz on 8/4/18.
 */
@Module
class FirebaseModule {

    @Provides
    fun provideFirebaseDatabase(): FirebaseDatabase {
        val firebaseDatabase = FirebaseDatabase.getInstance()
        return firebaseDatabase
    }
}