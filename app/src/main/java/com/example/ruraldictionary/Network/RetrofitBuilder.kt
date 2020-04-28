package com.example.ruraldictionary.Network

import com.example.ruraldictionary.BASE_URL
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import java.util.concurrent.TimeUnit

object RetrofitBuilder {

    val okhttpclient = OkHttpClient.Builder()
        .callTimeout(60, TimeUnit.SECONDS)
        .readTimeout(60, TimeUnit.SECONDS)
        .build()

    fun createApiService(): WordAPIservice {
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .client(okhttpclient)
            .baseUrl(BASE_URL)
            .build()

        return retrofit.create(WordAPIservice::class.java)
    }


}