package com.example.dailydiamond.ui.activity.screen

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.view.WindowManager
import com.example.dailydiamond.databinding.ActivitySplashBinding
import com.example.dailydiamond.ui.activity.BaseActivity
import com.example.dailydiamond.ui.activity.MainActivity

class SplashActivity : BaseActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window.apply {
            clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            decorView.systemUiVisibility =
                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or
                        View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
            statusBarColor = Color.TRANSPARENT
        }
        Handler(Looper.getMainLooper()).postDelayed({
            Intent(this@SplashActivity,MainActivity::class.java).apply {
                startActivity(this)
                finish()
            }
        }, 2000)
    }
}