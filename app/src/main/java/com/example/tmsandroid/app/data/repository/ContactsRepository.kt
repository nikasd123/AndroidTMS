package com.example.tmsandroid.app.data.repository

import com.example.tmsandroid.app.data.local.ContactEntity
import com.example.tmsandroid.app.data.remote.dto.ContactDto

interface ContactsRepository {
    suspend fun getContacts(): List<ContactDto>?
    suspend fun getLocalContacts(): List<ContactEntity>?
}