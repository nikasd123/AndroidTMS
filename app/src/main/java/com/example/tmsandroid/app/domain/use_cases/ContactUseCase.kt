package com.example.tmsandroid.app.domain.use_cases

import com.example.tmsandroid.app.data.remote.dto.toContactList
import com.example.tmsandroid.app.domain.repository.ContactsRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ContactUseCase @Inject constructor(
    private val contactsRepository: ContactsRepository
) {
    fun getContacts() = contactsRepository.getContacts().toContactList()
}