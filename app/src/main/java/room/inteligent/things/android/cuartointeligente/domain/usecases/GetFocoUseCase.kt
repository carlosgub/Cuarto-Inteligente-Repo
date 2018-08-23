package room.inteligent.things.android.cuartointeligente.domain.usecases

import io.reactivex.Observable
import room.inteligent.things.android.cuartointeligente.domain.model.Foco
import room.inteligent.things.android.cuartointeligente.domain.repository.FocoRepository
import javax.inject.Inject

/**
 * Cuarto Inteligente
 * Creado por Carlos Ugaz on 8/4/18.
 */
class GetFocoUseCase @Inject constructor(private val rep: FocoRepository) {

    /** Obtener el estado actual del foco*/
    fun getEstado() : Observable<Foco>{
        return rep.getEstado()
    }

    /** Cambiar el estado del boton */
    fun cambiarEstado(child:String, estado:Boolean) {
        return rep.cambiarEstado(child,estado)
    }

}