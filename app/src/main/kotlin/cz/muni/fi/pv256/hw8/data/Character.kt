package cz.muni.fi.pv256.hw8.data

import android.os.Parcelable
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

// https://rickandmortyapi.com/documentation/#character-schema
@Parcelize
@JsonClass(generateAdapter = true)
data class Character(
    val id: Int,
    val name: String,
    val status: String = "unknown",
    val species: String = "unknown",
    val type: String = "unknown",
    val gender: String = "unknown",
    val image: String = "",
    val location: Location
) : Parcelable
