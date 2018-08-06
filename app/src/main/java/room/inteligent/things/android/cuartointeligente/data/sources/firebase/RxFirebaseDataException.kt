package room.inteligent.things.android.cuartointeligente.data.sources.firebase

import com.google.firebase.database.DatabaseError

/**
 * Cuarto Inteligente
 * Creado por Carlos Ugaz on 8/4/18.
 */
class RxFirebaseDataException(error: DatabaseError) : Exception() {

    var error: DatabaseError
        protected set

    init {
        this.error = error
    }

    override fun toString(): String {
        return "RxFirebaseDataException{" +
                "error=" + error +
                '}'
    }
}

