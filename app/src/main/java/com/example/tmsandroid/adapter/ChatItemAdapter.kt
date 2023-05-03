package com.example.tmsandroid.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.tmsandroid.R
import com.example.tmsandroid.fragments.UserInfoFragment

class ChatItemAdapter(
    private val dataset: List<MyData> = mutableListOf()
) : RecyclerView.Adapter<ChatItemAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view), View.OnClickListener {
        val avatar: ImageView = view.findViewById(R.id.avatar)
        val userName: TextView = view.findViewById(R.id.user_name)
        val description: TextView = view.findViewById(R.id.description)

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val fragment = UserInfoFragment()
            val transaction = (v?.context as AppCompatActivity)
                .supportFragmentManager.beginTransaction()
            transaction.replace(R.id.user_info_fragment, fragment)
            transaction.addToBackStack(null)
            transaction.commit()
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
