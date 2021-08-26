package com.example.walletapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        transaction()
    }
    var tvDescription = findViewById<TextView>(R.id.tvDescription)
    var tvReference = findViewById<TextView>(R.id.tvRefNo)
    var tvDate = findViewById<TextView>(R.id.tvDate)
    var tvAmount = findViewById<TextView>(R.id.tvAmount)
    var tvType= findViewById<TextView>(R.id.tvTransactionType)

}

fun transaction(){

}