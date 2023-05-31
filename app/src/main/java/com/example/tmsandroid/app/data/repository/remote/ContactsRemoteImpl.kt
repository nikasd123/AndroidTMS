package com.example.tmsandroid.app.data.repository.remote

import com.example.tmsandroid.app.data.remote.api.ContactsApi
import com.example.tmsandroid.app.data.remote.dto.ContactDto
import com.example.tmsandroid.app.data.remote.dto.ResponseDto
import javax.inject.Inject

class ContactsRemoteImpl @Inject constructor(
    private val contactsApi: ContactsApi
) : ContactsRemote {
    override suspend fun getContacts(): ResponseDto =
        contactsApi.getLatestNews()
}