package com.example.tmsandroid.app.data.remote.dto

import com.example.tmsandroid.app.domain.models.DomainContact
import com.google.gson.annotations.SerializedName

data class ContactDto(
    @SerializedName("title")
    val username: String,

    @SerializedName("description")
    val description: String,

    @SerializedName("url")
    val url: String,

    @SerializedName("urlToImage")
    val urlToImage: String,

    @SerializedName("publishedAt")
    val publishedAt: String
)

fun ContactDto.toContact() =
    DomainContact(
        username = username,
        description = description,
        url = url,
        urlToImage = urlToImage,
        publishedAt = publishedAt
    )