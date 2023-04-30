package com.example.tmsandroid.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tmsandroid.R
import com.example.tmsandroid.adapter.MyData
import com.example.tmsandroid.adapter.MyRecyclerAdapter
import com.example.tmsandroid.databinding.FragmentChatsBinding


class ChatsFragment : Fragment() {
    private lateinit var binding: FragmentChatsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentChatsBinding.inflate(inflater, container, false)
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        binding.recyclerView.adapter = MyRecyclerAdapter(listOfItems())
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

    companion object {
        @JvmStatic
        fun newInstance() = ChatsFragment()
    }
}