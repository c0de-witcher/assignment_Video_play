package com.example.assignment

import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
       playvideo()

    }

    override fun onRestart() {
        super.onRestart()
        playvideo()

    }
    fun playvideo(){
        val videoview = findViewById<VideoView>(R.id.videoview)
        val uideopath = "android.resource://"+ packageName + "/"+ R.raw.video
        val uri = Uri.parse(uideopath)

        videoview.setVideoURI(uri)
        videoview.start()
        val mediscontroller = MediaController(this)
        videoview.setMediaController(mediscontroller)
    }


}