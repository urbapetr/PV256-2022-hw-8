package cz.muni.fi.pv256.hw8.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import cz.muni.fi.pv256.hw8.data.Character

class MainViewModel : ViewModel() {

    private val _items = MutableLiveData<List<Character>>()

    val items: LiveData<List<Character>>
        get() = _items

    fun fetchCharacters(page: Int) {
        // TODO _items.postValue with downloaded data with characters
        // needs to be invoked as a coroutine
    }
}
