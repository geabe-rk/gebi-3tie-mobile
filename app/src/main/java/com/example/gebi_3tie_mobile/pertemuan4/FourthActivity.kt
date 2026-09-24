package com.example.gebi_3tie_mobile.pertemuan4

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.gebi_3tie_mobile.R

class FourthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_fourth)

        val name = intent.getStringExtra("name")
        val from = intent.getStringExtra("from")
        val age = intent.getIntExtra("age", 0)

        Log.e(
            "Data Intent",
            "Nama: $name, Usia: $age, Asal: $from"
        )
    }
}