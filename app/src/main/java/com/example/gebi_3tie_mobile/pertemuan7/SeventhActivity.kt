
package com.example.gebi_3tie_mobile.pertemuan7

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.gebi_3tie_mobile.R

class SeventhActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seventh)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        supportActionBar?.title = "Pertemuan 7"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        toolbar.setNavigationOnClickListener {
            finish()
        }

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, SatuFragment())
                .commit()
        }

        // Fragment 1
        findViewById<android.widget.Button>(R.id.btnFragment1)
            .setOnClickListener {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainer, SatuFragment())
                    .commit()
            }

        // Fragment 2
        findViewById<android.widget.Button>(R.id.btnFragment2)
            .setOnClickListener {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainer, DuaFragment())
                    .commit()
            }

        // Fragment 3
        findViewById<android.widget.Button>(R.id.btnFragment3)
            .setOnClickListener {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainer, TigaFragment())
                    .commit()
            }
    }
}
