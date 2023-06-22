package com.example.th

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.ContextMenu
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity:AppCompatActivity (){
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button: Button = findViewById(R.id.button)
        var text1: TextView = findViewById(R.id.text)



        text1.setOnClickListener {

                var text1 = "hello"
                val intent: Intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("text1", text1)
                startActivity(intent)
            }


        var mau = 1

        button.setOnClickListener {
            if (mau == 1) {
                mau = 2
                text1.text = " Ngọc Châu"
                button.setBackgroundColor(resources.getColor(R.color.A))
                text1.setTextColor(resources.getColor(R.color.B))

            } else {
                text1.text = "Ngọc"

            }
        }
    }


    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }


}