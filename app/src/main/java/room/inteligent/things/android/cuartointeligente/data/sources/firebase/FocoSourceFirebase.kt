package room.inteligent.things.android.cuartointeligente.data.sources.firebase

import com.androidhuman.rxfirebase2.database.dataChanges
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.FirebaseDatabase
import io.reactivex.Observable
import javax.inject.Inject

/**
 * Cuarto Inteligente
 * Creado por Carlos Ugaz on 8/4/18.
 */
class FocoSourceFirebase @Inject constructor(private val firebaseDatabase: FirebaseDatabase) {

    fun getEstados() : Observable<DataSnapshot> {
        val ref = firebaseDatabase.reference
        return RxFirebaseDatabase.observableSingleValueEvent(ref)
    }

    fun estadosListener() : Observable<DataSnapshot> {
        val ref = firebaseDatabase.reference
        return ref.dataChanges()
    }

    fun CambiarEstado(child: String,estado:Boolean)  {
        firebaseDatabase.reference.child(child).setValue(estado)
    }


}