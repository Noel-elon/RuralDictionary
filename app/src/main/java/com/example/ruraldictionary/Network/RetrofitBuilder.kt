package com.example.ruraldictionary.Network

import com.example.ruraldictionary.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitBuilder {
    fun createApiService(): WordAPIservice {
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()

        return retrofit.create(WordAPIservice::class.java)
    }


}