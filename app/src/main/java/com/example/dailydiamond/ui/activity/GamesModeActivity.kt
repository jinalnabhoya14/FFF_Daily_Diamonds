package com.example.dailydiamond.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.OnBackPressedCallback
import com.example.dailydiamond.databinding.ActivityGamesModeBinding

class GamesModeActivity : BaseActivity() {
    private lateinit var binding: ActivityGamesModeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGamesModeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onBackPressedDispatcher.addCallback(this,object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                finish()
            }
        })

        binding.apply {
            btn1.setOnClickListener {
                Intent(this@GamesModeActivity,LevelActivity::class.java).apply {
                    putExtra("image",intent.getIntExtra("image",0))
                    putExtra("title",intent.getStringExtra("title"))
                    putExtra("gridLayout",intent.getStringExtra("gridLayout"))
                    startActivity(this)
                }
            }
            btn2.setOnClickListener {
                Intent(this@GamesModeActivity,LevelActivity::class.java).apply {
                    putExtra("image",intent.getIntExtra("image",0))
                    putExtra("title",intent.getStringExtra("title"))
                    putExtra("gridLayout",intent.getStringExtra("gridLayout"))
                    startActivity(this)
                }
            }
            btn3.setOnClickListener {
                Intent(this@GamesModeActivity,LevelActivity::class.java).apply {
                    putExtra("image",intent.getIntExtra("image",0))
                    putExtra("title",intent.getStringExtra("title"))
                    putExtra("gridLayout",intent.getStringExtra("gridLayout"))
                    startActivity(this)
                }
            }
            btn4.setOnClickListener {
                Intent(this@GamesModeActivity,LevelActivity::class.java).apply {
                    putExtra("image",intent.getIntExtra("image",0))
                    putExtra("title",intent.getStringExtra("title"))
                    putExtra("gridLayout",intent.getStringExtra("gridLayout"))
                    startActivity(this)
                }
            }
            btnBack.setOnClickListener { onBackPressedDispatcher.onBackPressed() }
        }
    }
}