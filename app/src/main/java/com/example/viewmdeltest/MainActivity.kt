package com.example.viewmdeltest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.viewmdeltest.Model.Person
import com.example.viewmdeltest.ViewModel.CalculateAgeViewModel

class MainActivity : AppCompatActivity() {
    lateinit var calculate:Button
    lateinit var textView: TextView
    lateinit var name:EditText
    lateinit var age:EditText
    private val viewModel:CalculateAgeViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calculate = findViewById(R.id.button)
        textView = findViewById(R.id.textView)
        name = findViewById(R.id.edname)
        age = findViewById(R.id.edage)

        calculate.setOnClickListener {
            viewModel.calculateAge(name.text.toString(),age.text.toString()).observe(this, Observer {person->
                textView.text="your name : ${person.name} your age : ${person.age}"
            })

        }

    }


}