package cz.muni.fi.pv256.hw8.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import cz.muni.fi.pv256.hw8.data.Character
import cz.muni.fi.pv256.hw8.data.CharacterList

class MainViewModel : ViewModel() {

    private val _items = MutableLiveData<List<Character>>()

    val items: LiveData<List<Character>>
        get() = _items

    suspend fun fetchCharacters(page: Int) {
        // TODO _items.postValue with downloaded data with characters
        // needs to be invoked as a coroutine
        val characterList = CharacterList(page)
        _items.postValue(characterList)
    }
}
