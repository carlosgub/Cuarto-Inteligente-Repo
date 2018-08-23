package room.inteligent.things.android.cuartointeligente.domain.repository

import io.reactivex.Observable
import room.inteligent.things.android.cuartointeligente.domain.model.Light

/**
 * Cuarto Inteligente
 * Creado por Carlos Ugaz on 8/4/18.
 */
interface LightRepository {
    fun getState(): Observable<Light> /** Get the current state of the light */
    fun changeState(child:String, estado: Boolean) /** Change the state of the light */
}