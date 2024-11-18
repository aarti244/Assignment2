package com.example.button

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.button.R

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView)
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val button4: Button = findViewById(R.id.button4)
        val button5: Button = findViewById(R.id.button5)

        // Button 1: Change text of TextView
        button1.setOnClickListener {
            textView.text = "Text changed!"
        }

        // Button 2: Change height of TextView
        button2.setOnClickListener {
            val newHeight = 200 // Set new height in pixels
            val layoutParams = textView.layoutParams
            layoutParams.height = newHeight
            textView.layoutParams = layoutParams
        }

        // Button 3: Center TextView on the screen
        button3.setOnClickListener {
            val layoutParams = textView.layoutParams as ViewGroup.MarginLayoutParams
            layoutParams.topMargin = 0
            layoutParams.bottomMargin = 0
            layoutParams.leftMargin = 0
            layoutParams.rightMargin = 0
            textView.layoutParams = layoutParams
            textView.gravity = Gravity.CENTER
        }

        // Button 4: Reset text to default
        button4.setOnClickListener {
            textView.text = "Default Text"
        }

        // Button 5: Change TextView background color
        button5.setOnClickListener {
            textView.setBackgroundColor(resources.getColor(android.R.color.holo_blue_light, null))
        }
    }
}
