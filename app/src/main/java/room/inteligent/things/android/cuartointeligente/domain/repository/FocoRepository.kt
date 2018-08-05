package room.inteligent.things.android.cuartointeligente.domain.repository

import io.reactivex.Observable
import room.inteligent.things.android.cuartointeligente.domain.model.Foco

/**
 * CorrePalabras
 * Created by ITLAB on 8/5/18.
 */
interface FocoRepository {
    fun getEstados(): Observable<Foco>
    fun estadosListener(): Observable<Foco>
    fun CambiarEstado(child:String, estado: Boolean)
}