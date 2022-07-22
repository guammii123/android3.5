package com.example.android35

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.android35.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var nameAnimal: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClicker()
    }

    fun initClicker(){
        binding.btnDog.setOnClickListener {
            binding.ivAnimal.setImageResource(R.drawable.img_1)
            nameAnimal = "dog"
        }
        binding.btnCat.setOnClickListener {
            binding.ivAnimal.setImageResource(R.drawable.img)
            nameAnimal = "cat"
        }
        binding.btnGiraffe.setOnClickListener {
            binding.ivAnimal.setImageResource(R.drawable.img_2)
            nameAnimal = "giraffe"
        }
        binding.btnThatDog.setOnClickListener {
            if (nameAnimal == "dog"){
                Toast.makeText(this, "true", Toast.LENGTH_SHORT).show()
            }else Toast.makeText(this, "false", Toast.LENGTH_SHORT).show()
        }
        binding.btnThatCat.setOnClickListener {
            if (nameAnimal == "cat"){
                Toast.makeText(this, "true", Toast.LENGTH_SHORT).show()
            }else Toast.makeText(this, "false", Toast.LENGTH_SHORT).show()
        }
        binding.btnThatGiraffe.setOnClickListener {
            if (nameAnimal == "giraffe"){
                Toast.makeText(this, "true", Toast.LENGTH_SHORT).show()
            }else Toast.makeText(this, "false", Toast.LENGTH_SHORT).show()
        }
        binding.btnResult.setOnClickListener {
            var intent: Intent = Intent(this@MainActivity, ResultActivity::class.java)
            intent.putExtra("key", nameAnimal)
            startActivity(intent)
        }
    }
}