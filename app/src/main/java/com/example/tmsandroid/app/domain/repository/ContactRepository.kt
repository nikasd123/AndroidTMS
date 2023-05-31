package com.example.tmsandroid.app.domain.repository

import com.example.tmsandroid.app.data.remote.dto.ContactDto

interface ContactRepository {
    suspend fun getContacts(): List<ContactDto>
}