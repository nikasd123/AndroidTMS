package com.example.tmsandroid.app.data.repository.remote

import com.example.tmsandroid.app.data.remote.dto.ResponseDto

interface ContactsRemote {
    suspend fun getContacts(): ResponseDto

}