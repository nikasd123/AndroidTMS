package com.example.tmsandroid.app.presentation.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tmsandroid.databinding.MainWindowBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: MainWindowBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = MainWindowBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}