package com.example.ruraldictionary.Models

data class WordObject(
    val definition: String,
    val permalink: String,
    val thumbs_up: Int,
    val sound_urls: List<String>,
    val defid: Long,
    val current_vote: String,
    val written_on: String,
    val thumbs_down: Int,
    val author: String,
    val example: String,
    val word: String

)