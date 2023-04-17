package com.latihan.androidpremission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.latihan.androidpremission.databinding.ActivityNormalPermissionBinding

class NormalPermission : AppCompatActivity() {

    lateinit var binding : ActivityNormalPermissionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityNormalPermissionBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnLoadImage.setOnClickListener {
            Glide.with(this)
                .load("https://i.ibb.co/zJHYGBP/binarlogo.jpg")
                .circleCrop()
                .into(binding.ivBinar)
        }

    }
}