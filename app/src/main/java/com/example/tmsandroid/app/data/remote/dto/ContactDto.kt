package com.example.tmsandroid.app.data.remote.dto

import com.example.tmsandroid.app.domain.models.DomainContact
import com.example.tmsandroid.app.domain.models.DomainContactList

data class ContactDto(
    val id: Int,
    val userName: String?,
    val description: String?
)

fun ContactDto.toContact(): DomainContact =
    DomainContact(
        id = id,
        userName = userName,
        description = description
    )

fun List<ContactDto>.toContactList() =
    DomainContactList(
        this.map {
            it.toContact()
        }
    )