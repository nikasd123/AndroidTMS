package com.example.tmsandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tmsandroid.fragments.NewsFragment

class HomePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_window)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.news_fragment, NewsFragment.newInstance())
            .commit()
    }

}