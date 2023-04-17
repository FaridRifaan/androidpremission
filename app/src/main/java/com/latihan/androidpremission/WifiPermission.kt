package com.latihan.androidpremission

import android.content.Context
import android.net.wifi.WifiManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.latihan.androidpremission.databinding.ActivityWifiPermissionBinding

class WifiPermission : AppCompatActivity() {
    lateinit var binding : ActivityWifiPermissionBinding
    lateinit var wifiManager: WifiManager
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityWifiPermissionBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        wifiManager = applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager

        binding.button.setOnClickListener {
            wifiManager.isWifiEnabled = true
            Toast.makeText(this, "Wifi enabled", Toast.LENGTH_SHORT).show()
        }
        binding.btnOff.setOnClickListener {
            wifiManager.isWifiEnabled = false
            Toast.makeText(this, "Wifi disabled", Toast.LENGTH_SHORT).show()
        }

    }

}