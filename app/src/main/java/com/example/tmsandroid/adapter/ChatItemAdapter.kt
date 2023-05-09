package com.example.tmsandroid.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.NavController
import androidx.recyclerview.widget.RecyclerView
import com.example.tmsandroid.R
import com.example.tmsandroid.fragments.UserInfoFragment

class ChatItemAdapter(
    private val dataset: List<MyData> = mutableListOf(),
    private val navController: NavController
) : RecyclerView.Adapter<ChatItemAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val avatar: ImageView = view.findViewById(R.id.avatar)
        val userName: TextView = view.findViewById(R.id.user_name)
        val description: TextView = view.findViewById(R.id.description)

        init {
            itemView.setOnClickListener{
                navController.navigate(R.id.action_chats_fragment_to_user_info_fragment)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.chat_item, parent, false)

        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataset[position]
        holder.avatar.setImageResource(item.avatarId)
        holder.userName.text = item.userName
        holder.description.text = item.description
    }

    override fun getItemCount() = dataset.size
}
