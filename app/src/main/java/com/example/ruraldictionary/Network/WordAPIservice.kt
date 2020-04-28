package com.example.ruraldictionary.Network

import com.example.ruraldictionary.API_KEY
import com.example.ruraldictionary.BASE_URL
import com.example.ruraldictionary.Models.WordObject
import com.example.ruraldictionary.Models.WordResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query

interface WordAPIservice {

    @Headers("x-rapidapi-key: $API_KEY")
    @GET("define")
    suspend fun getWordproperties(@Query("term") word: String): WordResponse
}