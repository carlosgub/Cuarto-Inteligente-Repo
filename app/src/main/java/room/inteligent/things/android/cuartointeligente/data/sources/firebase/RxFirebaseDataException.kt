package room.inteligent.things.android.cuartointeligente.data.sources.firebase

import com.google.firebase.database.DatabaseError

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

