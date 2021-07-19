package com.example.user.listimagekotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var imageList = arrayOf(R.drawable.magoke, R.drawable.smp, R.drawable.android)
    var textList = arrayOf("ini gambar MAGOKE", "ini gambar SMP", "ini gambar ANDROID")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listview)

        val adapter = CustomAdapter(this@MainActivity, imageList, textList)

        listView.adapter = adapter

        listView.onItemClickListener = object : AdapterView.OnItemClickListener{
            override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@MainActivity,""+textList[position], Toast.LENGTH_SHORT).show()

                val intent = Intent (this@MainActivity, Main2Activity::class.java)
                intent.putExtra("text", textList[position])
                intent.putExtra("image", imageList[position])
                startActivity(intent)

            }

        }
    }
}
