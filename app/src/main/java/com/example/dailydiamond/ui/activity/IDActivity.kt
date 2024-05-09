package com.example.dailydiamond.ui.activity

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import androidx.activity.OnBackPressedCallback
import com.example.dailydiamond.databinding.ActivityIdactivityBinding

class IDActivity : BaseActivity() {
    private lateinit var binding: ActivityIdactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIdactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onBackPressedDispatcher.addCallback(this,object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                finish()
            }
        })
        binding.apply {
            btnBack.setOnClickListener { onBackPressedDispatcher.onBackPressed() }
            btnClaim.setOnClickListener {
                if (etId.text?.isEmpty() == true){
                    etId.error = "Please Enter Id"
                }else{
                    Intent(this@IDActivity,GamesModeActivity::class.java).apply {
                        putExtra("image",intent.getIntExtra("image",0))
                        putExtra("tile",intent.getStringExtra("title"))
                        putExtra("gridLayout",intent.getStringExtra("gridLayout"))
                        startActivity(this)
                    }
                }
            }
            btnSkip.setOnClickListener {
                Intent(this@IDActivity,GamesModeActivity::class.java).apply {
                    putExtra("image",intent.getIntExtra("image",0))
                    putExtra("tile",intent.getStringExtra("title"))
                    putExtra("gridLayout",intent.getStringExtra("gridLayout"))
                    startActivity(this)
                }
            }
        }
    }
}