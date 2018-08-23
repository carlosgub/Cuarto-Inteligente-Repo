package room.inteligent.things.android.cuartointeligente.data.repository

import io.reactivex.Observable
import room.inteligent.things.android.cuartointeligente.data.sources.firebase.FocoSourceFirebase
import room.inteligent.things.android.cuartointeligente.domain.model.Foco
import room.inteligent.things.android.cuartointeligente.domain.repository.FocoRepository
import javax.inject.Inject

/**
 * Cuarto Inteligente
 * Creado por Carlos Ugaz on 8/4/18.
 */
class FocoDataRepository @Inject constructor(private val source: FocoSourceFirebase) : FocoRepository {

    /** Obtener el estado actual del foco*/
    override fun getEstado(): Observable<Foco> {
        return source.getEstados().map {
            val foco = it.child("focoUno").getValue(Boolean::class.java)?:false
            Foco(foco)
        }
    }

    /** Cambiar el estado del boton */
    override fun cambiarEstado(child:String, estado: Boolean) {
        return source.cambiarEstado(child,estado)
    }
}