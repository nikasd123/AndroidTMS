package com.example.tmsandroid.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tmsandroid.R

class MyRecyclerAdapter(
    private val dataset: List<MyData> = mutableListOf()
) : RecyclerView.Adapter<MyRecyclerAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val avatar: ImageView = view.findViewById(R.id.avatar)
        val userName: TextView = view.findViewById(R.id.user_name)
        val description: TextView = view.findViewById(R.id.description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.chat_item, parent, false) as View

        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataset[position]

        holder.avatar.setImageResource(item.avatarId)
        holder.userName.text = item.userName
        holder.description.text = item.description


//        holder.itemView.setOnClickListener { view ->
//            holder.itemView.setOnClickListener {
//                listener.onItemClick(position)
//            }
//        }
    }

    interface OnItemClickListener {
        fun onItemClick(data: Int)
    }
    override fun getItemCount() = dataset.size

}
