package com.example.tmsandroid.app.presentation.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tmsandroid.R
import com.example.tmsandroid.app.domain.models.DomainContactList
import com.example.tmsandroid.app.presentation.adapters.ChatItemAdapter
import com.example.tmsandroid.app.presentation.view_models.ContactsViewModel
import com.example.tmsandroid.databinding.FragmentChatsBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class ChatsFragment : Fragment(R.layout.fragment_chats) {
    private lateinit var binding: FragmentChatsBinding
    private val viewModel: ContactsViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentChatsBinding.bind(view)

        val layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.layoutManager = layoutManager

        initRecycler()
    }

    private fun initRecycler() {
        val contacts = viewModel.contactList.value ?: DomainContactList()

        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = ChatItemAdapter(
                items = contacts,
                onItemClickEvent = {
                    findNavController().navigate(R.id.action_chats_fragment_to_user_info_fragment)
                }
            )
        }
    }
}