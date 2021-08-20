package com.ismailucel.kotlintutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Toast
import com.ismailucel.kotlintutorial.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var timesClicked =0

        binding.button.setOnClickListener {
            timesClicked+=1
            binding.textView.text = timesClicked.toString()
            Toast.makeText(this@MainActivity, "Hi Ismail.", Toast.LENGTH_SHORT).show()

        }





    }
}