package com.example.tmsandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tmsandroid.fragments.SpinnerFragment

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_window)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.spinnerFragment, SpinnerFragment.newInstance())
            .commit()
    }
}