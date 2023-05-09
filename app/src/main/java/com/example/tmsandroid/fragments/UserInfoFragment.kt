package com.example.tmsandroid.fragments

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

        openSecretFragment()
    }


    private fun openSecretFragment() {
        binding.secretButton.setOnClickListener {
            val fragmentManager = requireActivity().supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()

            fragmentTransaction.replace(
                com.google.android.material.R.id.container,
                SecretFragment()
            )
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }
    }
}