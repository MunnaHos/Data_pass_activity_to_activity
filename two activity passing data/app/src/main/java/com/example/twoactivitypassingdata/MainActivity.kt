package com.example.twoactivitypassingdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var name: TextView
    private lateinit var number: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button =findViewById(R.id.btn_show)
        name = findViewById(R.id.name)
        number = findViewById(R.id.number)


        button.setOnClickListener {
            var fullname = name.text.toString()
            val mobilenumber = number.text.toString()
          //  fullname=getString(R.string.Santona )  //bring string file

            //This activity and second activity
            val passData = Intent(this,MainActivity2::class.java)
            passData.putExtra("fullname",fullname)
            passData.putExtra("mobilenumber",mobilenumber)
            startActivity(passData)

        }


    }
}
