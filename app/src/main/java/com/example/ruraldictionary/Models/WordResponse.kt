package com.example.ruraldictionary.Models

import com.google.gson.annotations.SerializedName

data class WordResponse(
    @SerializedName("list")
    val wordList: List<WordObject>

)