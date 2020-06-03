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
    lateinit var definitions: ArrayList<String>
    lateinit var examples: ArrayList<String>
    private lateinit var wordArray: ArrayList<WordObject>


    fun getWordList() {
        viewModelScope.launch(Dispatchers.Default) {
            try {
                val callResponse = RetrofitBuilder.createApiService().getWordproperties("Noel")
                val res: WordResponse = callResponse

                for (word in res.wordList) {

                    val obj: WordObject = word
                    Log.d("Success: ", "I got to this place")
                    wordList.postValue(obj)
                    wordArray.add(obj)

                }
            } catch (e: Exception) {
                Log.d("Exception:", e.message.toString())
            }

        }
    }

    fun getDefinitions() {
        for (word in wordArray) {
            definitions.add(word.definition)
        }
    }

    fun getExamples() {
        for (word in wordArray) {
            examples.add(word.example)
        }
    }


}


