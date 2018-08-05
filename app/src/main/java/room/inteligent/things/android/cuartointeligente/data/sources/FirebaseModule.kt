package room.inteligent.things.android.cuartointeligente.data.sources

import com.google.firebase.database.FirebaseDatabase
import dagger.Module
import dagger.Provides

/**
 * CorrePalabras
 * Created by ITLAB on 8/5/18.
 */
@Module
class FirebaseModule {

    @Provides
    fun provideFirebaseDatabase(): FirebaseDatabase {
        val firebaseDatabase = FirebaseDatabase.getInstance()
        return firebaseDatabase
    }
}