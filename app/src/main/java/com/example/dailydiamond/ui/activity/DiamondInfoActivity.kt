package com.example.dailydiamond.ui.activity

import android.os.Bundle
import androidx.activity.OnBackPressedCallback
import com.example.dailydiamond.databinding.ActivityDiamondInfoBinding

class DiamondInfoActivity : BaseActivity() {
    private lateinit var binding: ActivityDiamondInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDiamondInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onBackPressedDispatcher.addCallback(this,object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                finish()
            }
        })
        binding.btnBack.setOnClickListener { onBackPressedDispatcher.onBackPressed() }
        binding.txtTitle.text = intent.getStringExtra("title")
        binding.txtInfo.text = intent.getStringExtra("info")
    }
}