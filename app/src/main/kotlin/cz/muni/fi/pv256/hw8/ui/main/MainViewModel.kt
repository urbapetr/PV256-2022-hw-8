package cz.muni.fi.pv256.hw8.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cz.muni.fi.pv256.hw8.api.ApiService
import cz.muni.fi.pv256.hw8.data.Character
import cz.muni.fi.pv256.hw8.data.CharacterList
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val _items = MutableLiveData<List<Character>>()

    val items: LiveData<List<Character>>
        get() = _items

    fun fetchCharacters(page: Int) {
        viewModelScope.launch() {
            val characterList: CharacterList = ApiService.instance.getAllCharacters()
            //val myPage: CharacterList = ApiService.instance.getPage(page)
            _items.postValue(characterList.results)
        }
    }
}
