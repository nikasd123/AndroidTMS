package com.example.tmsandroid.app.data.repository.local

import com.example.tmsandroid.app.data.local.ContactEntity

interface ContactsLocal {
    suspend fun getLocalContacts(): List<ContactEntity>?

    suspend fun insertContact(contactEntity: ContactEntity)

    suspend fun deleteContact(contactEntity: ContactEntity)

    suspend fun updateContact(contactEntity: ContactEntity)
}