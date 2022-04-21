package cz.muni.fi.pv256.hw8.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
// TODO implement missing fields and annotations
    // https://rickandmortyapi.com/documentation/#location-schema
data class Location(val id: Int,
                    val name: String = "",
                    val type: String = "",
                    val dimension: String = "",
                    val url: String = "",
                    val created: String = "") : Parcelable
