package com.example.ruraldictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ruraldictionary.Repository.Repository
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val repository = Repository()
        textview.text = repository.getWordObject()
    }


}
