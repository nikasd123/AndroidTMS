package com.example.tmsandroid.app.data.remote.api

import com.example.tmsandroid.app.data.remote.dto.ResponseDto
import retrofit2.http.GET
import retrofit2.http.Query

interface ContactsApi {
    companion object{
        const val GET_CONTACT_REQUEST = "top-headlines"

        const val SOURCE_PARAM = "sources"
        const val KEY_PARAM = "apiKey"

        const val API_KEY = "e6aac1143482416e88f49b8ce726d940"
        const val SOURCE_CONST = "techcrunch"
    }

    @GET(GET_CONTACT_REQUEST)
    suspend fun getLatestNews(
        @Query(SOURCE_PARAM) source: String = SOURCE_CONST,
        @Query(KEY_PARAM) apiKey: String = API_KEY
    ): ResponseDto
}