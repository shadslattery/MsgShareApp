package com.smartherd.msgshareapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {
            // Code
            Log.i("MainActivity", "Button was clicked !")

            Toast.makeText(this, "Button was clicked !", Toast.LENGTH_SHORT).show()
        }

        btnSendMsgToNextActivity.setOnClickListener {
            val message: String = etUserMessage.text.toString()
            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtra("user_message", message)

            startActivity(intent)
        }

    }

}
