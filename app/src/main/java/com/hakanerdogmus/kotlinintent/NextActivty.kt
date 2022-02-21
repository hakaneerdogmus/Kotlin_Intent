package com.hakanerdogmus.kotlinintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hakanerdogmus.kotlinintent.databinding.ActivityMainBinding
import com.hakanerdogmus.kotlinintent.databinding.ActivityNextActivtyBinding

class NextActivty : AppCompatActivity() {
    private lateinit var binding: ActivityNextActivtyBinding

    lateinit var username : String
    lateinit var name : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNextActivtyBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent //intenti çağırdığımız kısım

        username = intent.getStringExtra("username").toString()   //username değişkenine intent ten aldıpımız bilgiyi atıyoruz
        name = intent.getStringExtra("name").toString()           //name değişkenine intent ten aldığımız bilgiyi atıyoruz.

        binding.userNameTextNextActivity.text = username
        binding.nameTextNextActivity.text = name
    }
}