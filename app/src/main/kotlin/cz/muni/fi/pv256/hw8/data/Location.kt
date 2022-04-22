package cz.muni.fi.pv256.hw8.data

import android.os.Parcelable
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

// https://rickandmortyapi.com/documentation/#location-schema
@Parcelize
@JsonClass(generateAdapter = true)
data class Location(val id: Int = 0,
                    val name: String = "unknown",
                    val type: String = "unknown",
                    val dimension: String = "unknown",
                    val url: String = "unknown",
                    val created: String = "unknown") : Parcelable
