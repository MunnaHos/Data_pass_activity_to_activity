package com.example.twoactivitypassingdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private lateinit var name: TextView
    private lateinit var number: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        name= findViewById(R.id.name)
        number= findViewById(R.id.number)

       var strname = intent.getStringExtra("fullname")
        var strnumber = intent.getStringExtra("mobilenumber")
       name.setText(strname)
        number.setText(strnumber)

    }
}