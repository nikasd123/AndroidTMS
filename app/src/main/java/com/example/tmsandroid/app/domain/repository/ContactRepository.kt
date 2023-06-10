package com.example.tmsandroid.app.domain.repository

import com.example.tmsandroid.app.data.local.ContactEntity
import com.example.tmsandroid.app.data.remote.dto.ContactDto

interface ContactRepository {
    suspend fun getContacts(): List<ContactDto>
    suspend fun getLocalContacts(): List<ContactEntity>
    suspend fun getContactInfoFromLocal(): ContactEntity?
}