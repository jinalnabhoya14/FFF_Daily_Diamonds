package com.example.dailydiamond.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.OnBackPressedCallback
import com.example.dailydiamond.databinding.ActivityMainBinding
import com.example.dailydiamond.ui.activity.screen.SettingActivity

class MainActivity : BaseActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initListener()
    }
    private fun initListener() {
        binding.apply {
            imgCharacter.setOnClickListener {
                Intent(this@MainActivity,CharactersActivity::class.java).apply {
                    startActivity(this)
                }
            }
            imgPets.setOnClickListener {
                Intent(this@MainActivity,PetsActivity::class.java).apply {
                    startActivity(this)
                }
            }
            imgBundle.setOnClickListener {
                Intent(this@MainActivity,BundlesActivity::class.java).apply {
                    startActivity(this)
                }
            }
            imgWeapon.setOnClickListener {
                Intent(this@MainActivity,WeaponsActivity::class.java).apply {
                    startActivity(this)
                }
            }
            imgVehicle.setOnClickListener {
                Intent(this@MainActivity,VehicleActivity::class.java).apply {
                    startActivity(this)
                }
            }
            imgEmotes.setOnClickListener {
                Intent(this@MainActivity,EmotesActivity::class.java).apply {
                    startActivity(this)
                }
            }
            imgParachute.setOnClickListener {
                Intent(this@MainActivity,ParachuteActivity::class.java).apply {
                    startActivity(this)
                }
            }
            imgDiamond.setOnClickListener {
                Intent(this@MainActivity,DiamondActivity::class.java).apply {
                    startActivity(this)
                }
            }
            imgCalc.setOnClickListener {
                Intent(this@MainActivity,DiamondCalcActivity::class.java).apply {
                    startActivity(this)
                }
            }
            btnSetting.setOnClickListener {
                Intent(this@MainActivity,SettingActivity::class.java).apply {
                    startActivity(this)
                }
            }
        }
        onBackPressedDispatcher.addCallback(this,object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                val exitDialogNative = ExitDialogNative()
                exitDialogNative.show(supportFragmentManager, "")
            }
        })
    }
}