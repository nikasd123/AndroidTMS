package com.example.tmsandroid.app.data.repository

import com.example.tmsandroid.app.data.remote.dto.ContactDto
import com.example.tmsandroid.app.data.repository.remote.ContactsRemote
import com.example.tmsandroid.app.data.repository.remote.ContactsRemoteImpl
import com.example.tmsandroid.app.domain.repository.ContactRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ContactsRepositoryImpl @Inject constructor(
    private val contactsRemote: ContactsRemote
) : ContactRepository {
    override fun getContacts(): List<ContactDto> = contactsRemote.getContacts()
    override fun getContactInfo(): ContactDto = contactsRemote.getContactInfo()
}