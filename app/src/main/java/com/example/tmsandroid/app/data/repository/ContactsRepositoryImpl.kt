package com.example.tmsandroid.app.data.repository

import com.example.tmsandroid.app.data.local.ContactEntity
import com.example.tmsandroid.app.data.remote.dto.ContactDto
import com.example.tmsandroid.app.data.remote.dto.toLocalContact
import com.example.tmsandroid.app.data.repository.local.ContactsLocal
import com.example.tmsandroid.app.data.repository.remote.ContactsRemote
import com.example.tmsandroid.app.domain.repository.ContactRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ContactsRepositoryImpl @Inject constructor(
    private val contactsRemote: ContactsRemote,
    private val contactsLocal: ContactsLocal
) : ContactRepository {


    override suspend fun getContacts(): List<ContactDto> {
        val contactList = contactsRemote.getContacts().posts.orEmpty()

        if (contactList.isNotEmpty()) {
            contactList.forEach {
                contactsLocal.insertContact(contactEntity = it.toLocalContact())
            }
        }

        return contactList
    }

    override suspend fun getLocalContacts(): List<ContactEntity> =
        contactsLocal.getLocalContacts().orEmpty()


    override suspend fun getContactInfoFromLocal(): ContactEntity? {
        return null
    }

}