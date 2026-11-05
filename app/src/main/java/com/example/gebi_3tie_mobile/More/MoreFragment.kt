
package com.example.gebi_3tie_mobile.more

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.gebi_3tie_mobile.databinding.FragmentMoreBinding

class MoreFragment : Fragment() {

    private var _binding: FragmentMoreBinding? = null
    private val binding get() = _binding!!

    private val dataList = listOf(
        "Kotlin",
        "Java",
        "Python",
        "C++",
        "JavaScript",
        "Dart",
        "Swift",
        "Go",
        "Ruby",
        "R",
        "PHP",
        "C#",
        "TypeScript",
        "Shell",
        "SQL",
        "Perl",
        "Rust",
        "Scala",
        "Haskell",
        "Lua",
        "Erlang",
        "Prolog",
        "Assembly",
        "Objective-C",
        "VBA"
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMoreBinding.inflate(
            inflater,
            container,
            false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Toolbar
        (requireActivity() as AppCompatActivity)
            .setSupportActionBar(binding.toolbar)

        (requireActivity() as AppCompatActivity)
            .supportActionBar?.title = "More"

        // Membuat ArrayAdapter
        val adapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_list_item_1,
            dataList
        )

        // Menghubungkan ListView dengan Adapter
        binding.listViewItems.adapter = adapter

        // Aksi ketika item ListView diklik
        binding.listViewItems.setOnItemClickListener {
                _, _, position, _ ->

            val selectedItem = dataList[position]

            Toast.makeText(
                requireContext(),
                "Kamu memilih: $selectedItem",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
