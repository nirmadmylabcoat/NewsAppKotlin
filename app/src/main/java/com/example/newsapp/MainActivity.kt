package com.example.newsapp

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val songsObject = mutableListOf<song>()
        songsObject.add(song("Hello","Just a description"))
        songsObject.add(song("Can you hear me","Adele"))
        songsObject.add(song("I'm wondering","Someone"))
        songsObject.add(song("Halazia","ATEEZ"))
        songsObject.add(song("Butterfly","BTS"))
        songsObject.add(song("Light","ATEEZ"))
        songsObject.add(song("Eternal Sunshine","ATEEZ"))
        songsObject.add(song("Sorry","Justin Bieber"))
        songsObject.add(song("vit lozuh","MEEEE"))
        songsObject.add(song("Irresponsible","Emei"))

        val songList: RecyclerView = findViewById(R.id.songList) // Assuming songList is your RecyclerView in XML
        val layoutManager = LinearLayoutManager(this)
        songList.layoutManager = layoutManager

        songList.adapter = MyAdapter(songsObject)
        songList.layoutManager=LinearLayoutManager(this)


    }
}
