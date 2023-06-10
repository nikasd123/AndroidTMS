package com.example.tmsandroid.app.data.local

import androidx.room.RoomDatabase

abstract class ContactsDatabase : RoomDatabase() {
    abstract fun contactsDao(): ContactsDao
}