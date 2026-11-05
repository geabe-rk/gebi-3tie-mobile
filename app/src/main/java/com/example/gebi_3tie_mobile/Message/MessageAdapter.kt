package com.example.gebi_3tie_mobile.Message

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.bumptech.glide.Glide
import com.example.gebi_3tie_mobile.databinding.ItemMessageBinding
import com.google.android.material.snackbar.Snackbar
import com.example.gebi_3tie_mobile.Message.MessageModel

class MessageAdapter(
    context: Context,
    private val Messages: List<MessageModel>
) : ArrayAdapter<MessageModel>(context, 0, Messages) {

    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup
    ): View {

        val binding: ItemMessageBinding =
            ItemMessageBinding.inflate(
                LayoutInflater.from(getContext()),
                parent,
                false
            )

        val view = binding.root

        val data = Messages[position]

        Glide.with(getContext())
            .load(data.avatarUrl)
            .into(binding.avatarImg)

        binding.textSender.text = data.senderName
        binding.textMessage.text = data.messageText

        view.setOnClickListener {
            Snackbar.make(
                parent,
                "Pesan dari ${data.senderName}: ${data.messageText}",
                Snackbar.LENGTH_SHORT
            ).show()
        }

        return view
    }
}
