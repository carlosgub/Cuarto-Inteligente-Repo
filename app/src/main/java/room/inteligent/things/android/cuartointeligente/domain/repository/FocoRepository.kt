package room.inteligent.things.android.cuartointeligente.domain.repository

import io.reactivex.Observable
import room.inteligent.things.android.cuartointeligente.domain.model.Foco

/**
 * Cuarto Inteligente
 * Creado por Carlos Ugaz on 8/4/18.
 */
interface FocoRepository {
    fun getEstado(): Observable<Foco> /** Obtener el estado actual del foco*/
    fun cambiarEstado(child:String, estado: Boolean) /** Cambiar el estado del boton */
}