package cz.muni.fi.pv256.hw8.data

import android.app.DownloadManager
import okhttp3.OkHttpClient
import java.io.IOException

// TODO implement missing fields and annotations
// https://rickandmortyapi.com/documentation/#get-all-characters
data class CharacterList(override val size: Int) : List<Character>{
    private val client = OkHttpClient()
    val request = DownloadManager.Request.Builder()
        .url("https://rickandmortyapi.com/api/character")
        .build()

    val charList: List<Character>
    val a = client.newCall(request).execute().use { response ->
        if (!response.isSuccessful) throw IOException("Unexpected code $response")

        for ((name, value) in response.headers) {
            println("$name: $value")
        }

        println(response.body!!.string())
    }
    
    override fun contains(element: Character): Boolean {
        return charList.contains(element)
    }

    override fun containsAll(elements: Collection<Character>): Boolean {
        return charList.containsAll(elements)
    }

    override fun get(index: Int): Character {
        return charList[index]
    }

    override fun indexOf(element: Character): Int {
        return charList.indexOf(element)
    }

    override fun isEmpty(): Boolean {
        return charList.isEmpty()
    }

    override fun iterator(): Iterator<Character> {
        return charList.iterator()
    }

    override fun lastIndexOf(element: Character): Int {
        return charList.lastIndexOf(element)
    }

    override fun listIterator(): ListIterator<Character> {
        return charList.listIterator()
    }

    override fun listIterator(index: Int): ListIterator<Character> {
        return charList.listIterator(index)
    }

    override fun subList(fromIndex: Int, toIndex: Int): List<Character> {
        return charList.subList(fromIndex, toIndex)
    }
}
