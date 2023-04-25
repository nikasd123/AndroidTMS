package com.example.tmsandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tmsandroid.fragments.LanguagesFragment

class HomePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_window)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.languages_fragment, LanguagesFragment.newInstance())
            .commit()
    }

}