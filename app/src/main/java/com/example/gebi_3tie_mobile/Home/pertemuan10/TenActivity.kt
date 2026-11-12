package com.example.gebi_3tie_mobile.Home.pertemuan10

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.gebi_3tie_mobile.databinding.ActivityTenBinding
import com.google.android.material.chip.Chip

class TenActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Inisialisasi Toolbar
        setSupportActionBar(binding.toolbar)

        supportActionBar?.title = "Pertemuan 10"
        supportActionBar?.setDisplayHomeAsUpEnabled(false)

        // Tombol Back
        binding.toolbar.setNavigationOnClickListener {
            finish()
        }

        // Mendeteksi Chip yang dipilih
        binding.chipGroupFilter.setOnCheckedStateChangeListener { group, checkedIds ->

            // Ambil ID Chip yang dipilih
            val selectedChipId = checkedIds.firstOrNull()

            if (selectedChipId != null) {

                // Mendapatkan objek Chip berdasarkan ID
                val chip = group.findViewById<Chip>(selectedChipId)

                // Menampilkan Chip yang dipilih
                Toast.makeText(
                    this,
                    "Filter: ${chip.text}",
                    Toast.LENGTH_SHORT
                ).show()

                // Lakukan logika filter di sini
            }
        }
    }
}
