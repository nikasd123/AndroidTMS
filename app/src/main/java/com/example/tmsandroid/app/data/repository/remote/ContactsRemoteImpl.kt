package com.example.tmsandroid.app.data.repository.remote

import com.example.tmsandroid.app.data.remote.dto.ContactDto

class ContactsRemoteImpl : ContactsRemote{
    override fun getContacts(): List<ContactDto> =
        mutableListOf(
            ContactDto(
                id = 1,
                userName = "Unknown User",
                description = "Description"
            ),
            ContactDto(
                id = 2,
                userName = "Unknown User",
                description = "Description"
            ),
            ContactDto(
                id = 3,
                userName = "Unknown User",
                description = "Description"
            ),
            ContactDto(
                id = 4,
                userName = "Unknown User",
                description = "Description"
            ),
            ContactDto(
                id = 5,
                userName = "Unknown User",
                description = "Description"
            ),
            ContactDto(
                id = 6,
                userName = "Unknown User",
                description = "Description"
            ),
            ContactDto(
                id = 7,
                userName = "Unknown User",
                description = "Description"
            ),
            ContactDto(
                id = 8,
                userName = "Unknown User",
                description = "Description"
            ),
            ContactDto(
                id = 9,
                userName = "Unknown User",
                description = "Description"
            ),
            ContactDto(
                id = 10,
                userName = "Unknown User",
                description = "Description"
            ),
            ContactDto(
                id = 11,
                userName = "Unknown User",
                description = "Description"
            ),
            ContactDto(
                id = 12,
                userName = "Unknown User",
                description = "Description"
            ),
            ContactDto(
                id = 13,
                userName = "Unknown User",
                description = "Description"
            ),
            ContactDto(
                id = 14,
                userName = "Unknown User",
                description = "Description"
            ),
            ContactDto(
                id = 15,
                userName = "Unknown User",
                description = "Description"
            ),
            ContactDto(
                id = 16,
                userName = "Unknown User",
                description = "Description"
            ),
            ContactDto(
                id = 17,
                userName = "Unknown User",
                description = "Description"
            ),
            ContactDto(
                id = 18,
                userName = "Unknown User",
                description = "Description"
            ),
            ContactDto(
                id = 19,
                userName = "Unknown User",
                description = "Description"
            ),
            ContactDto(
                id = 20,
                userName = "Unknown User",
                description = "Description"
            )
        )
}