package cz.muni.fi.pv256.hw8.data

import com.squareup.moshi.JsonClass

// https://rickandmortyapi.com/documentation/#get-all-characters
@JsonClass(generateAdapter = true)
data class CharacterList(val results: List<Character> = mutableListOf())
