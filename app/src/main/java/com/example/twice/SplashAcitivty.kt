package com.example.twice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler as Handler

class SplashAcitivty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_acitivty)

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        },3000)

    }
}