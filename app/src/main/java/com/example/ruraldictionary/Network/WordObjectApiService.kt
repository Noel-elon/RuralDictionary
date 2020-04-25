package com.example.ruraldictionary.Network

import retrofit2.http.GET

interface WordObjectApiService {

    @GET()
    fun getWordName()
}