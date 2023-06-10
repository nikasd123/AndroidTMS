package com.example.tmsandroid.app.data.repository.local

import com.example.tmsandroid.app.data.local.ContactEntity
import com.example.tmsandroid.app.data.local.ContactsDao
import javax.inject.Inject

class ContactsLocalImpl @Inject constructor(
    private val contactsDao: ContactsDao
) : ContactsLocal {
    override suspend fun getLocalContacts(): List<ContactEntity>? = contactsDao.getAll()

    override suspend fun insertContact(contactEntity: ContactEntity) {
        contactsDao.insert(contactEntity = contactEntity)
    }

    override suspend fun deleteContact(contactEntity: ContactEntity) {
        contactsDao.delete(contactEntity = contactEntity)
    }

    override suspend fun updateContact(contactEntity: ContactEntity) {
        contactsDao.update(contactEntity = contactEntity)
    }

}