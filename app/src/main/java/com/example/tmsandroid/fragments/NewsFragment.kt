package com.example.tmsandroid.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tmsandroid.R
import com.example.tmsandroid.adapter.MyRecyclerAdapter
import com.example.tmsandroid.databinding.FragmentNewsBinding

class NewsFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var binding: FragmentNewsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNewsBinding.inflate(inflater, container, false)
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        binding.recyclerView.adapter = MyRecyclerAdapter(listOfElements())
    }

    private fun listOfElements(): List<String> {
        val data = mutableListOf<String>()
        (0..50).forEach { i -> data.add("$i item") }
        return data
    }

    companion object {
        @JvmStatic
        fun newInstance() = NewsFragment()
    }
}