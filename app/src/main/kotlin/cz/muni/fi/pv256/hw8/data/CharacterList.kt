package cz.muni.fi.pv256.hw8.data

import com.squareup.moshi.JsonClass

// TODO implement missing fields and annotations
// https://rickandmortyapi.com/documentation/#get-all-characters
@JsonClass(generateAdapter = true)
data class CharacterList(val characterList: List<Character> = mutableListOf())
