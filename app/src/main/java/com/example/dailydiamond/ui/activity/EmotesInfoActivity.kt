package com.example.dailydiamond.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.OnBackPressedCallback
import com.example.dailydiamond.databinding.ActivityEmotesInfoBinding

class EmotesInfoActivity : BaseActivity() {
    private lateinit var binding: ActivityEmotesInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEmotesInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onBackPressedDispatcher.addCallback(this,object :OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                finish()
            }
        })
        binding.imgMain.setImageResource(intent.getIntExtra("image",0))
        binding.btnClaim.setOnClickListener {
            Intent(this@EmotesInfoActivity,IDActivity::class.java).apply {
                putExtra("image",intent.getIntExtra("image",0))
                startActivity(this)
            }
        }
        binding.btnBack.setOnClickListener { onBackPressedDispatcher.onBackPressed() }
    }
}