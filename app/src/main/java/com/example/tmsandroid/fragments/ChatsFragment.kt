package com.example.tmsandroid.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tmsandroid.R
import com.example.tmsandroid.adapter.MyData
import com.example.tmsandroid.adapter.ChatItemAdapter
import com.example.tmsandroid.databinding.FragmentChatsBinding


class ChatsFragment : Fragment(R.layout.fragment_chats) {
    private lateinit var binding: FragmentChatsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentChatsBinding.bind(view)

        val layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.layoutManager = layoutManager

        initRecyclerView()
    }

    private fun initRecyclerView() {
        binding.recyclerView.adapter = ChatItemAdapter(listOfItems(), findNavController())
    }

    private fun listOfItems(): List<MyData> {
        val items = mutableListOf<MyData>()
        for (i in 1..20) {
            items.add(
                MyData(
                    R.drawable.unknown_user_logo, "User $i", "Description $i"
                )
            )
        }

        return items
    }
}