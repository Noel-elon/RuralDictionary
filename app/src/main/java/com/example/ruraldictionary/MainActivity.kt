package com.example.ruraldictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.ruraldictionary.Repository.Repository
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var repository: Repository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        repository = ViewModelProvider(this).get(Repository::class.java)
        repository.getWordList()
        repository.wordList.observe(this, Observer {
            textview.text = it.toString()
        })


    }


}
