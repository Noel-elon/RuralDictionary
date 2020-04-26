package com.example.ruraldictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.ruraldictionary.Repository.WordObjectViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var repository: WordObjectViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        repository = ViewModelProvider(this).get(WordObjectViewModel::class.java)
        repository.getWordList()
        repository.wordList.observe(this, Observer {
            textview.text = it.toString()
        })


    }


}
