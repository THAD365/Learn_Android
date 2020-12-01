package com.example.androidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_new.*

class NewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        var data = intent.getParcelableExtra<User>("user")
        if (data != null) {
            textView_new_name.text = data.name
        }


    }
}