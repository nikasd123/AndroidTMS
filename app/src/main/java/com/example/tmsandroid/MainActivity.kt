package com.example.tmsandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import com.example.tmsandroid.fragments.RegistrationFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_window)

        openRegistrationFragment()
    }

    private fun openRegistrationFragment() {
        val registrationFragment = RegistrationFragment()

        supportFragmentManager.beginTransaction()
            .replace(R.id.registration_fragment, registrationFragment)
            .commit()
    }
}