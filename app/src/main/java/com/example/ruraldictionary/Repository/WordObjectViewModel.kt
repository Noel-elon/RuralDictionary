package com.example.ruraldictionary.Repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ruraldictionary.Models.WordObject
import com.example.ruraldictionary.Models.WordResponse
import com.example.ruraldictionary.Network.RetrofitBuilder
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import okhttp3.Call
import okhttp3.Callback
import okhttp3.Dispatcher
import retrofit2.Response

class WordObjectViewModel : ViewModel() {
    val wordList = MutableLiveData<WordObject>()

    fun getWordList() {
        viewModelScope.launch(Dispatchers.Default) {
            try {
                val callResponse = RetrofitBuilder.createApiService().getWordproperties("Noel")
                val res : WordResponse = callResponse
                val obj : WordObject = res.wordList[1]
                Log.d("Success: ", "I got to this place")
                 wordList.postValue(obj)
            } catch (e: Exception) {
                Log.d("Exception:", e.message.toString())
            }

        }
    }

}


