package room.inteligent.things.android.cuartointeligente.domain.usecases

import io.reactivex.Observable
import room.inteligent.things.android.cuartointeligente.domain.model.Foco
import room.inteligent.things.android.cuartointeligente.domain.repository.FocoRepository
import javax.inject.Inject

/**
 * Carlos Ugaz
 * Created by CarlosU on 8/5/18.
 */
class GetFocoUseCase @Inject constructor(private val rep: FocoRepository) {

    fun getEstados() : Observable<Foco>{
        return rep.getEstados()
    }

    fun estadosListener() : Observable<Foco>{
        return rep.estadosListener()
    }

    fun cambiarEstado(child:String, estado:Boolean) {
        return rep.CambiarEstado(child,estado)
    }

}