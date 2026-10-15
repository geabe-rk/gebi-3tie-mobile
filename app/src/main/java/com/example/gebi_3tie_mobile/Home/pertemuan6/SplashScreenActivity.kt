package com.example.gebi_3tie_mobile.Home.pertemuan6

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.gebi_3tie_mobile.BaseActivity
import com.example.gebi_3tie_mobile.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        lifecycleScope.launch {
            delay(2000)

            val sharedPref = getSharedPreferences(
                "user_pref",
                MODE_PRIVATE
            )

            val isLogin = sharedPref.getBoolean("isLogin", false)

            val intent = if (isLogin) {
                Intent(
                    this@SplashScreenActivity,
                    BaseActivity::class.java
                )
            } else {
                Intent(
                    this@SplashScreenActivity,
                    AuthActivity::class.java
                )
            }

            startActivity(intent)
            finish()
        }
    }
}