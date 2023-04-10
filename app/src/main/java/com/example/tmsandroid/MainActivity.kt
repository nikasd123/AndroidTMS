package com.example.tmsandroid

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lists()

        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }

    private fun lists() {
        val students = listOf("Sergey", "Nikita", "Sasha")
        val animals = mutableSetOf("Cat", "Dog", "Bear")
        animals.add("Parrot")
        val vocabulary = mapOf(
            "Hello" to "Привет",
            "World" to "Мир"
        )

        students.forEach {
            Log.d("TEST_ANDROID", "Student: $it")
        }

        animals.forEach{
            Log.d("TEST_ANDROID", "Animal: $it")
        }

        Log.d("TEST_ANDROID", vocabulary.entries.joinToString {
            "${it.key}: ${it.value}"
        })

    }
}