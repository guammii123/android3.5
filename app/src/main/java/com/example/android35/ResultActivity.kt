package com.example.android35

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android35.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var data = intent.getStringExtra("key")
        binding.tvResult.text = data
    }
}