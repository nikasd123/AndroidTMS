package com.example.tmsandroid

import android.util.Log

fun lists() {
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