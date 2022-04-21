package cz.muni.fi.pv256.hw8.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
// TODO implement missing fields and annotations
// https://rickandmortyapi.com/documentation/#character-schema
data class Character(val id: Int,
                     val name: String = "",
                     val status: String = "",
                     val species: String = "",
                     val type: String = "",
                     val gender: String = "",
                     val image: String = "",
                     val location: Location) : Parcelable
