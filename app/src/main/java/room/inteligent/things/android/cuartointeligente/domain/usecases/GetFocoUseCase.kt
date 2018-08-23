package room.inteligent.things.android.cuartointeligente.domain.usecases

import io.reactivex.Observable
import room.inteligent.things.android.cuartointeligente.domain.model.Light
import room.inteligent.things.android.cuartointeligente.domain.repository.LightRepository
import javax.inject.Inject

/**
 * Cuarto Inteligente
 * Creado por Carlos Ugaz on 8/4/18.
 */
class GetFocoUseCase @Inject constructor(private val rep: LightRepository) {

    /** Get the current state of the light */
    fun getState() : Observable<Light>{
        return rep.getState()
    }

    /** Change the state of the light */
    fun changeState(child:String, estado:Boolean) {
        return rep.changeState(child,estado)
    }

}