package room.inteligent.things.android.cuartointeligente.data.repository

import io.reactivex.Observable
import room.inteligent.things.android.cuartointeligente.data.sources.firebase.FocoSourceFirebase
import room.inteligent.things.android.cuartointeligente.domain.model.Light
import room.inteligent.things.android.cuartointeligente.domain.repository.LightRepository
import javax.inject.Inject

/**
 * Cuarto Inteligente
 * Creado por Carlos Ugaz on 8/4/18.
 */
class LightDataRepository @Inject constructor(private val source: FocoSourceFirebase) : LightRepository {

    /** Get the current state of the light */
    override fun getState(): Observable<Light> {
        return source.getState().map {
            val light = it.child("light").getValue(Boolean::class.java)?:false
            Light(light)
        }
    }

    /** Change the state of the light */
    override fun changeState(child:String, estado: Boolean) {
        return source.changeState(child,estado)
    }
}