package com.example.dailydiamond.ui.activity.screen

import android.os.Bundle
import com.example.dailydiamond.databinding.ActivityPrivacyScreenBinding
import com.example.dailydiamond.ui.activity.BaseActivity

class PrivacyScreenActivity : BaseActivity() {

    private var binding: ActivityPrivacyScreenBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrivacyScreenBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.apply {
            buttonAccept.setOnClickListener {
                finish()
            }
        }
    }
}