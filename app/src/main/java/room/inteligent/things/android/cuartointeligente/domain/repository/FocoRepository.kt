package room.inteligent.things.android.cuartointeligente.domain.repository

import io.reactivex.Observable
import room.inteligent.things.android.cuartointeligente.domain.model.Foco

/**
 * Cuarto Inteligente
 * Creado por Carlos Ugaz on 8/4/18.
 */
interface FocoRepository {
    fun getEstados(): Observable<Foco>
    fun estadosListener(): Observable<Foco>
    fun CambiarEstado(child:String, estado: Boolean)
}