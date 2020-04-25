package com.example.ruraldictionary.Repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ruraldictionary.Models.WordResponse
import com.example.ruraldictionary.Network.RetrofitBuilder
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import okhttp3.Dispatcher

class Repository : ViewModel() {
    val wordList = MutableLiveData<WordResponse>()

    fun getWordList() {
        viewModelScope.launch(Dispatchers.Default) {

            try {
                wordList.postValue(RetrofitBuilder.createApiService().getWordproperties("wat"))
            }catch (e : Exception){
                Log.d("Exception:", e.message.toString())
            }

        }

    }


}