package com.example.gamecatalogue.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.gamecatalogue.R
import com.example.gamecatalogue.models.GamesData

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_bg)

        supportActionBar?.hide()

        Handler().postDelayed({
            val intentAbout = Intent(this, MainActivity::class.java)
            startActivity(intentAbout)
            finish()
        }, 3000)

    }
}