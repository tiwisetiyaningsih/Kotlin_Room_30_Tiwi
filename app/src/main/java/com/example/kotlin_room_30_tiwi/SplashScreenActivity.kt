package com.example.kotlin_room_30_tiwi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreenActivity : AppCompatActivity() {

    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        handler = Handler()
        handler.postDelayed({

            val intent = Intent(this,DashboardAnimeMovie::class.java)
            startActivity(intent)
            finish()


        }, 3000) //delaying 3s to open mainactivity

    }
}