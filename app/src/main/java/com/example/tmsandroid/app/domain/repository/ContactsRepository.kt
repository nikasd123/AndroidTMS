package com.example.tmsandroid.app.domain.repository

import com.example.tmsandroid.app.data.remote.dto.ContactDto
import com.example.tmsandroid.app.domain.models.DomainContact

interface ContactsRepository {
    fun getContacts(): List<DomainContact>
    fun getPostInfo(): ContactDto
}