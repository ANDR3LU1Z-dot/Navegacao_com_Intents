package com.example.navegaocomintents

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import com.example.navegaocomintents.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val toolbar = binding.toolbar

        setContentView(binding.root)

        //Necessário para Manipular a Toolbar
        setSupportActionBar(toolbar)

        supportActionBar?.title = "Outro Texto"
        supportActionBar?.setLogo(R.drawable.ic_logo)
        supportActionBar?.setDisplayUseLogoEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val buttonToSecond = binding.btnStartSecondActivity

        //Intent Explicita
        val toSecondActivity = Intent(this, SecondaryActivity::class.java)
            intent.putExtra("name", "Andre")
            intent.putExtra("age", 23)

        //Intent Implicita
        val sendIntent = Intent()
        sendIntent.action = Intent.ACTION_SEND
        sendIntent.putExtra(Intent.EXTRA_TEXT, "Minha Mensagem")
        sendIntent.type = "text/plain"


//            val activityResult =
//                registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result: ActivityResult ->
//                    if (result.resultCode == Activity.RESULT_OK) {
//                        val intent = result.data
//                        if (intent?.hasExtra("result") == true) {
//                            Snackbar.make(
//                                binding.root,
//                                intent.getStringExtra("result") ?: "",
//                                Snackbar.LENGTH_SHORT
//                            ).show()
//                        }
//                    }
//                }

            buttonToSecond.setOnClickListener {
//                activityResult.launch(toSecondActivity)
                startActivity(sendIntent)

            }


        }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }


    }