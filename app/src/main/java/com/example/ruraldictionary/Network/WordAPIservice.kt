package com.example.ruraldictionary.Network

import com.example.ruraldictionary.Models.WordObject
import com.example.ruraldictionary.Models.WordResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WordAPIservice {
    @GET("define")
    fun getWordproperties(@Query("query") word: String): Call<WordResponse>
}