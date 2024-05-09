package com.example.dailydiamond.ui.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.OnBackPressedCallback
import com.example.dailydiamond.databinding.ActivityEndBinding

class EndActivity : BaseActivity() {
    private lateinit var binding: ActivityEndBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEndBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onBackPressedDispatcher.addCallback(this,object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                finish()
            }
        })

        binding.apply {
            imgMain.setImageResource(intent.getIntExtra("image",0))

            btnApply.setOnClickListener {
                cardFinal.visibility = View.VISIBLE
            }

            btnOk.setOnClickListener {
                startActivity(Intent(this@EndActivity,MainActivity::class.java))
                finish()
            }
            btnBack.setOnClickListener { onBackPressedDispatcher.onBackPressed() }
        }
    }
}