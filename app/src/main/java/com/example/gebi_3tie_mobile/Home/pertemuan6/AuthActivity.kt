package com.example.gebi_3tie_mobile.Home.pertemuan6

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.gebi_3tie_mobile.BaseActivity
import com.example.gebi_3tie_mobile.R

class AuthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        val username = findViewById<EditText>(R.id.etUsername)
        val password = findViewById<EditText>(R.id.etPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener {
            val user = username.text.toString().trim()
            val pass = password.text.toString()

            if (user.isNotEmpty() && user == pass) {

                val sharedPref = getSharedPreferences(
                    "user_pref",
                    MODE_PRIVATE
                )

                sharedPref.edit()
                    .putBoolean("isLogin", true)
                    .putString("username", user)
                    .apply()

                val intent = Intent(this, BaseActivity::class.java)
                startActivity(intent)
                finish()

            } else {
                AlertDialog.Builder(this)
                    .setTitle("Login Gagal")
                    .setMessage("Silahkan coba lagi")
                    .setPositiveButton("OK", null)
                    .show()
            }
        }
    }
}