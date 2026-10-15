package com.example.gebi_3tie_mobile.home

import android.content.Context
import com.example.gebi_3tie_mobile.Home.pertemuan6.AuthActivity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.gebi_3tie_mobile.databinding.FragmentHomeBinding

// Sesuaikan import ini dengan package Activity yang benar di project kamu.
import com.example.gebi_3tie_mobile.Home.pertemuan3.ThirdActivity
import com.example.gebi_3tie_mobile.Home.pertemuan4.FourthActivity
import com.example.gebi_3tie_mobile.Home.pertemuan5.FifthActivity
import com.example.gebi_3tie_mobile.Home.pertemuan7.SeventhActivity

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Toolbar Home
        (requireActivity() as AppCompatActivity).setSupportActionBar(binding.toolbar)
        (requireActivity() as AppCompatActivity).supportActionBar?.title = "com/example/gebi_3tie_mobile/Home"

        // Tombol Pertemuan 3
        binding.btnToThird.setOnClickListener {
            startActivity(Intent(requireContext(), ThirdActivity::class.java))
        }

        // Tombol Pertemuan 4
        binding.btnToFourth.setOnClickListener {
            startActivity(Intent(requireContext(), FourthActivity::class.java))
        }

        // Tombol Pertemuan 5
        binding.btnToFifth.setOnClickListener {
            startActivity(Intent(requireContext(), FifthActivity::class.java))
        }

        // Tombol Pertemuan 7
        binding.btnToSeventh.setOnClickListener {
            startActivity(Intent(requireContext(), SeventhActivity::class.java))
        }

        // Logout
        binding.btnLogout.setOnClickListener {
            val sharedPref = requireContext()
                .getSharedPreferences("user_pref", Context.MODE_PRIVATE)

            sharedPref.edit()
                .putBoolean("isLogin", false)
                .remove("username")
                .apply()

            val intent = Intent(requireContext(), AuthActivity::class.java)
            startActivity(intent)
            requireActivity().finish()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
