package cz.muni.fi.pv256.hw8.api

import cz.muni.fi.pv256.hw8.data.CharacterList
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    // Use: https://rickandmortyapi.com/documentation/#get-all-characters
    // Implement also "page" query parameter, even though it's not really used within the app

    @GET("character")
    suspend fun getAllCharacters(@Query("page") page: Int): CharacterList

    companion object {

        private const val API_ENDPOINT = "https://rickandmortyapi.com/api/"

        val instance by lazy { create() }

        private fun create(): ApiService = Retrofit.Builder()
            .baseUrl(API_ENDPOINT)
            .addConverterFactory(MoshiConverterFactory.create())
            .client(OkHttpClient())
            .build()
            .create(ApiService::class.java)
    }
}
