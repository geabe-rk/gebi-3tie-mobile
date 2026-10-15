package com.example.gebi_3tie_mobile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.gebi_3tie_mobile.databinding.ActivityBaseBinding
import com.example.gebi_3tie_mobile.home.HomeFragment
import com.example.gebi_3tie_mobile.message.MessageFragment
import com.example.gebi_3tie_mobile.more.MoreFragment

class BaseActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBaseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBaseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavView.setOnItemSelectedListener { item ->
            val fragment: Fragment = when (item.itemId) {
                R.id.home -> HomeFragment()
                R.id.message -> MessageFragment()
                R.id.more -> MoreFragment()
                else -> HomeFragment()
            }

            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit()

            true
        }

        if (savedInstanceState == null) {
            binding.bottomNavView.selectedItemId = R.id.home
        }
    }
}
