package com.example.dailydiamond.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.OnBackPressedCallback
import com.example.dailydiamond.databinding.ActivityDiamondCalcBinding

class DiamondCalcActivity : BaseActivity() {
    private lateinit var binding: ActivityDiamondCalcBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDiamondCalcBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onBackPressedDispatcher.addCallback(this,object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                finish()
            }
        })
        binding.apply {
            layout1.setOnClickListener {
                Intent(this@DiamondCalcActivity,DiamondCountActivity::class.java).apply {
                    putExtra("basic","basic")
                    startActivity(this)
                }
            }
            layout2.setOnClickListener {
                Intent(this@DiamondCalcActivity,DiamondCountActivity::class.java).apply {
                    putExtra("normal","normal")
                    startActivity(this)
                }
            }
            layout3.setOnClickListener {
                Intent(this@DiamondCalcActivity,DiamondCountActivity::class.java).apply {
                    putExtra("advance","advance")
                    startActivity(this)
                }
            }
            btnBack.setOnClickListener { onBackPressedDispatcher.onBackPressed() }
        }
    }
}