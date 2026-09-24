package com.example.gebi_3tie_mobile.pertemuan3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gebi_3tie_mobile.R
import com.example.gebi_3tie_mobile.pertemuan4.FourthActivity

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_third)

        val intent = Intent(this, FourthActivity::class.java)

        intent.putExtra("name", "Politeknik Caltex Riau")
        intent.putExtra("age", 20)
        intent.putExtra("from", "Rumbai")

        startActivity(intent)
    }
}