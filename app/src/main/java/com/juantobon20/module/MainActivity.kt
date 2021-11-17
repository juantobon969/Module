package com.juantobon20.module

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.juantobon20.messagelibrary.AlertMessage
import com.juantobon20.module.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onClick(view: View) {
        when (view) {
            binding.btnClick -> {
                AlertMessage.showMessage(this, getString(R.string.app_name), "Hola") {
                    Toast.makeText(this, "Okis", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}