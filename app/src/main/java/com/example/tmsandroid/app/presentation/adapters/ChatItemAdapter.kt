package com.example.tmsandroid.app.presentation.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.tmsandroid.R
import com.example.tmsandroid.app.domain.models.DomainContact

class ChatItemAdapter(
    private val items: List<DomainContact>,
    private var context: Context,
    private val onItemClickEvent: (View) -> Unit
) : RecyclerView.Adapter<ChatItemAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val avatar: ImageView = view.findViewById(R.id.avatar)
        val userName: TextView = view.findViewById(R.id.user_name)
        val description: TextView = view.findViewById(R.id.description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.chat_item, parent, false)

        itemView.setOnClickListener {
            onItemClickEvent(it)
        }

        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.apply {
            userName.text = items[position].username
            description.text = items[position].publishedAt
        }

        Glide.with(holder.itemView)
            .load(items[position].urlToImage)
            .into(holder.avatar)
    }

    override fun getItemCount(): Int = items.size
}
