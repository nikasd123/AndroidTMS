package com.example.tmsandroid.app.presentation.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.NavController
import androidx.recyclerview.widget.RecyclerView
import com.example.tmsandroid.R
import com.example.tmsandroid.app.domain.models.DomainContactList

class ChatItemAdapter(
    private val items: DomainContactList,
    private val onItemClickEvent: (View) -> Unit
) : RecyclerView.Adapter<ChatItemAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
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
            userName.text = items.contacts?.get(position)?.userName
            description.text = items.contacts?.get(position)?.description
        }
    }

    override fun getItemCount(): Int = items.contacts?.size ?: 0
}
