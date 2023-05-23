package com.example.tmsandroid.app.domain.repository

import com.example.tmsandroid.app.data.remote.dto.ContactDto

interface ContactsRepository {
    fun getContacts(): List<ContactDto>
    fun getContactInfo(): ContactDto
}