package com.example.tmsandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tmsandroid.fragments.RegistrationFragment

class HomePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_window)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.registration_fragment, RegistrationFragment())
            .commit()
    }

}