package com.example.tmsandroid.app.domain.use_cases

import com.example.tmsandroid.app.data.remote.dto.toContact
import com.example.tmsandroid.app.data.remote.dto.toContactList
import com.example.tmsandroid.app.data.repository.ContactsRepositoryImpl
import com.example.tmsandroid.app.domain.models.DomainContact
import com.example.tmsandroid.app.domain.models.DomainContactList

class ContactUseCase {
    fun getContacts() : DomainContactList =
        ContactsRepositoryImpl().getContacts().toContactList()
}