package com.example.tmsandroid.app.presentation.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tmsandroid.R
import com.example.tmsandroid.app.domain.models.DomainContactList
import com.example.tmsandroid.app.presentation.adapters.ChatItemAdapter
import com.example.tmsandroid.app.presentation.adapters.MyData
import com.example.tmsandroid.app.presentation.view_models.ContactsViewModel
import com.example.tmsandroid.databinding.FragmentChatsBinding


class ChatsFragment : Fragment(R.layout.fragment_chats) {
    private lateinit var binding: FragmentChatsBinding
    private var viewModel: ContactsViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(owner = this)[ContactsViewModel::class.java]
    }

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
        val posts = viewModel?.contactList?.value ?: DomainContactList()
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