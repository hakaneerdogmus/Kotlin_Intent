package com.hakanerdogmus.kotlinintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.hakanerdogmus.kotlinintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }


    fun next(view : View){
        val intent = Intent(applicationContext,NextActivty::class.java)         //intent değişkeni tanımlayıp intent blirtiyoruz (context yazıyoruz bulunduğumuz veriyi alacağımız activity.

        intent.putExtra("username",binding.userNameText.text.toString()) //putExtra ile username anahtar ı oluşturup girdiğimiz bilgiyi string e çeviriyoruz
        intent.putExtra("name",binding.nameText.text.toString())
        startActivity(intent)

    }
}