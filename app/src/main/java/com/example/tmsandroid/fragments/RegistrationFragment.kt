package com.example.tmsandroid.fragments

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.tmsandroid.databinding.RegistrationFragmentBinding

class RegistrationFragment : Fragment() {
    lateinit var binding: RegistrationFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = RegistrationFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    private fun passwordLengthCheck() {
        val passwordText = binding.inputPassword

        passwordText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // This method is called to notify you that, within s, the count characters beginning at start are about to be replaced by new text with length after.
                binding.button.isEnabled = false
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // This method is called to notify you that, within s, the count characters beginning at start have just replaced old text that had length before.
            }

            override fun afterTextChanged(s: Editable?) {
                // This method is called to notify you that, somewhere within s, the text has been changed.
                val passwordLength = passwordText.text.length
                binding.button.isEnabled = false

                if (passwordLength > 8) {
                    binding.button.isEnabled = true
                    binding.button.setOnClickListener {
                        val action = MyFragmentDirections.actionMyFragmentToAnotherFragment()
                        val navController = Navigation.findNavController(requireView())
                        navController.navigate(action)
                    }
                }
            }
        })
    }
}