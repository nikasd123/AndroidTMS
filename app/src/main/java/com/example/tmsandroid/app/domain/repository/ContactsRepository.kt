package com.example.tmsandroid.app.domain.repository

import android.provider.ContactsContract.Contacts
import com.example.tmsandroid.app.domain.models.DomainContact

interface ContactsRepository {
    fun getContacts(): List<DomainContact>
}