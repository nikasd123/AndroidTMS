package com.example.tmsandroid.app.data.repository

import com.example.tmsandroid.app.data.remote.dto.ContactDto
import com.example.tmsandroid.app.data.repository.remote.ContactsRemote
import com.example.tmsandroid.app.data.repository.remote.ContactsRemoteImpl
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ContactsRepositoryImpl @Inject constructor(
    private val contactsRemote: ContactsRemote
) : ContactsRepository {
    override fun getContacts(): List<DataPostDto> = postsRemote.getPosts()
    override fun getContactInfo(): DataPostDto = postsRemote.getPostInfo()
}