package com.example.tmsandroid.app.presentation.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.tmsandroid.R
import com.example.tmsandroid.databinding.UserInfoBinding

class UserInfoFragment : Fragment(R.layout.user_info) {
    private lateinit var binding: UserInfoBinding


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = UserInfoBinding.bind(view)
    }
}