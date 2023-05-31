package com.example.tmsandroid.app.domain.use_cases

import com.example.tmsandroid.app.data.remote.dto.toContact
import com.example.tmsandroid.app.domain.models.DomainContact
import com.example.tmsandroid.app.domain.repository.ContactRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ContactUseCase @Inject constructor(
    private val contactRepository: ContactRepository
) {
    suspend fun getContacts() : List<DomainContact> =
        contactRepository.getContacts().map {
            it.toContact()
    }
}