package com.example.ruraldictionary.Repository

import android.util.Log
import com.example.ruraldictionary.Network.RetrofitBuilder
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import okhttp3.Dispatcher

class Repository {
    private var myJob: Job? = null
    private var viewModelJob = Job()
    private var scope = CoroutineScope(viewModelJob + Dispatchers.IO)


    fun getWordObject(): String {

        myJob = scope.launch {
            var getWords = RetrofitBuilder.createApiService().getWordproperties("wat")


        }
        return myJob.toString()

    }


}