package com.example.basicandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_send.setOnClickListener {
            sendData()
        }
    }

    private fun sendData(){
        val name = editText_name.text.toString()
        val email = editText_email.text.toString()
        val newIntent = Intent(this, NewActivity::class.java).apply {
            putExtra("user", User(name, email))
        }
        startActivity(newIntent)
    }

}