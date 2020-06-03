package com.example.ruraldictionary

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.ruraldictionary.Repository.WordObjectViewModel
import kotlinx.android.synthetic.main.fragment_home.view.*
import java.text.SimpleDateFormat
import java.util.*


class HomeFragment : Fragment() {

    lateinit var repository: WordObjectViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        repository = ViewModelProvider(this).get(WordObjectViewModel::class.java)
        repository.getWordList()
        repository.wordList.observe(this, Observer {
            view.textView.text = it.toString()
        })

        // Inflate the layout for this fragment
        return view


    }


}
