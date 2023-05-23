package com.example.tmsandroid.app.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.tmsandroid.R
import com.example.tmsandroid.app.presentation.view_models.UserInfoViewModel
import com.example.tmsandroid.databinding.UserInfoBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UserInfoFragment : Fragment(R.layout.user_info) {

    private lateinit var binding: UserInfoBinding
    private val viewModel: UserInfoViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = UserInfoBinding.inflate(inflater, container, false)
        return binding.root
    }
}