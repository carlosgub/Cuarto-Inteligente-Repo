package room.inteligent.things.android.cuartointeligente.data.repository

import io.reactivex.Observable
import room.inteligent.things.android.cuartointeligente.data.sources.firebase.FocoSourceFirebase
import room.inteligent.things.android.cuartointeligente.domain.model.Foco
import room.inteligent.things.android.cuartointeligente.domain.repository.FocoRepository
import javax.inject.Inject

/**
 * CorrePalabras
 * Created by ITLAB on 8/5/18.
 */
class FocoDataRepository @Inject constructor(private val source: FocoSourceFirebase) : FocoRepository {

    override fun getEstados(): Observable<Foco> {
        return source.getEstados().map {
            var focoUno = it.child("focoUno").getValue(Boolean::class.java)?:false
            var focoDos = it.child("focoDos").getValue(Boolean::class.java)?:false
            Foco(focoUno,focoDos)
        }
    }

}