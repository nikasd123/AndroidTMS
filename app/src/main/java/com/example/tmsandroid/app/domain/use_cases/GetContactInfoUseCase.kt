package com.example.tmsandroid.app.domain.use_cases

import com.example.tmsandroid.app.domain.repository.ContactsRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GetContactInfoUseCase @Inject constructor(
    private val contactsRepository: ContactsRepository
) {
    fun getContactInfo() = contactsRepository.getContactInfo()
}