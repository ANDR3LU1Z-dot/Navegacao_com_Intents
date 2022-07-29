package com.example.navegaocomintents

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.navegaocomintents.databinding.ActivityMainBinding
import com.example.navegaocomintents.databinding.ActivitySecondaryBinding
import kotlin.math.log

class SecondaryActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondaryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondaryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val result = Intent()
        result.putExtra("result", "Navegação com Intents")
        setResult(Activity.RESULT_OK, result)


//        if(this.intent?.extras?.isEmpty == false){
//            val name = intent.getStringExtra("name")
//            val age = intent.getIntExtra("age", 0)
//
//        }


        binding.btnStartSecondActivity.setOnClickListener {
            finish()
        }
    }

//    private fun toFirstActivity(){
//        Intent(this, MainActivity::class.java).also {
//            startActivity(it)
//            finish()
//        }
//
//    }
}