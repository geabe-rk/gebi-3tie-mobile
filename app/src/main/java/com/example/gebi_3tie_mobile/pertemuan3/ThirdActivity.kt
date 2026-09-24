package com.example.gebi_3tie_mobile.pertemuan3

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.gebi_3tie_mobile.R
import com.example.gebi_3tie_mobile.databinding.ActivityThirdBinding
import kotlin.jvm.java

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.btnKirim.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)

            val noTujuan = binding.inputNoTujuan.text
            Toast.makeText(this, "Pesan berhasil dikirim ke $noTujuan", Toast.LENGTH_SHORT).show()

        }
    }
}