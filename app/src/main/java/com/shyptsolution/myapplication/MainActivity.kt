package com.shyptsolution.myapplication

import com.shyptsolution.myapplication.R


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        auth= FirebaseAuth.getInstance()
        var text=findViewById<TextView>(R.id.email)
        text.setText(auth.currentUser?.email)
    }
}