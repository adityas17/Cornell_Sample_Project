package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintSet
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list = listOf("#FFBB86FC", "#FF6200EE", "#FF3700B3", "#FF03DAC5", "#FF018786", "#FF000000", "#FFFFFFFF" )
        val list2 = listOf(Color.BLACK,Color.BLUE,Color.GRAY)
        val layout: androidx.constraintlayout.widget.ConstraintLayout = findViewById(R.id.zzz)
        val textview: TextView = findViewById(R.id.textview1)
        val button1: Button = findViewById(R.id.Button1)
        val button2: Button = findViewById(R.id.Button2)
        val button3: Button = findViewById(R.id.Button3)
        val button4: Button = findViewById(R.id.Button4)
        val imageview: ImageView = findViewById(R.id.image)
        button1.setOnClickListener(){
            if(imageview.visibility== View.GONE){
                imageview.visibility = View.VISIBLE
            }
            else{
                imageview.visibility = View.GONE
            }
        }
        button2.setOnClickListener(){
            val randomIndex = Random.nextInt(list.size);
            val randomElement = list[randomIndex]
            layout.setBackgroundColor(Color.parseColor(randomElement))
            //layout.setBackgroundColor(randomElement);

        }
        button3.setOnClickListener(){
            imageview
        }
    }
}