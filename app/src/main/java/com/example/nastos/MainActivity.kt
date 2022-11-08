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
        val stosik = arrayOf(1,"dwa",'3')
        var stos = findViewById<TextView>(R.id.stosView)
        var kolejka = findViewById<TextView>(R.id.queueWiew)
        //podgląd
        findViewById<Button>(R.id.button5).setOnClickListener {
            stos.text="Wartości stosu"
            for (i in stosik){stos.setText(stos.text.toString()+i.toString())}
    }//wypisanie długości
        findViewById<Button>(R.id.button2).setOnClickListener {
            stos.text="Wysokość stosu: "+stosik.size.toString()
        }//dodanie elementu
        findViewById<Button>(R.id.button).setOnClickListener {
            stos.text="Dodano element nr. "+stosik.size.toString()+" o wartości "+findViewById<TextView>(R.id.textView).text.toString()
            stosik[stosik.size]=findViewById<TextView>(R.id.textView).text.toString()
        }//usunięcie elementu
        findViewById<Button>(R.id.button4).setOnClickListener {
            stos.text="Usunięcie element nr. "+(stosik.size-1).toString()+" o wartości "+findViewById<TextView>(R.id.textView).text.toString()
            stosik.reversed().drop(1)
                    }

}}