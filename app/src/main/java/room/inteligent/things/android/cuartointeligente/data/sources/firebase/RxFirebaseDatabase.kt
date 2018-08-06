package room.inteligent.things.android.cuartointeligente.data.sources.firebase

import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.Query
import com.google.firebase.database.ValueEventListener
import io.reactivex.Observable

/**
 * Cuarto Inteligente
 * Creado por Carlos Ugaz on 8/4/18.
 */
object RxFirebaseDatabase {

    fun observableSingleValueEvent(query: Query): Observable<DataSnapshot> {
        return Observable.create { oe ->
            query.addListenerForSingleValueEvent(
                    object : ValueEventListener {
                        override fun onDataChange(dataSnapshot: DataSnapshot) {
                            oe.onNext(dataSnapshot)
                        }

                        override fun onCancelled(databaseError: DatabaseError) {
                            oe.onError(RxFirebaseDataException(databaseError))
                        }
                    }
            )
        }
    }

}