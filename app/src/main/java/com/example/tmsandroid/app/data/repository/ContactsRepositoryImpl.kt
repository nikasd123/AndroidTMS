package com.example.tmsandroid.app.data.repository

import com.example.tmsandroid.app.data.remote.dto.ContactDto
import com.example.tmsandroid.app.data.repository.remote.ContactsRemoteImpl

class ContactsRepositoryImpl : ContactsRepository {
    override fun getContacts(): List<ContactDto> =
        ContactsRemoteImpl().getContacts()

}