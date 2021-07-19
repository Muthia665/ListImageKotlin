package com.example.user.listimagekotlin

import android.media.Image
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val textView = findViewById<TextView>(R.id.txtDetail)
        val imageView = findViewById<ImageView>(R.id.imgdetail)

        var txt = intent.getStringExtra("text")
        var img = intent.getIntExtra("image",0)

        textView.text = txt
        imageView.setImageResource(img)
    }
}
