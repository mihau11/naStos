package com.example.nastos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var stosik = arrayOf(1,2,3,4,5)
        var stos = findViewById<TextView>(R.id.stosView)
        var kolejka = findViewById<TextView>(R.id.queueWiew)
        //podgląd
        findViewById<Button>(R.id.button5).setOnClickListener {
            stos.text="Wartości stosu"
            for (i in stosik){stos.setText(stos.text.toString()+i.toString())}
    }
}}