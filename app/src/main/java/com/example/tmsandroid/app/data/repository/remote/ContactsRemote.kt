package com.example.tmsandroid.app.data.repository.remote

import com.example.tmsandroid.app.data.remote.dto.ContactDto

interface ContactsRemote {
    fun getContacts() : List<ContactDto>
}