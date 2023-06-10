package com.example.tmsandroid.app.di.module.repositories

import com.example.tmsandroid.app.data.local.ContactsDao
import com.example.tmsandroid.app.data.repository.local.ContactsLocal
import com.example.tmsandroid.app.data.repository.local.ContactsLocalImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class LocalRepositoryModule {

    @Provides
    fun provideContactsLocal(contactsDao: ContactsDao): ContactsLocal =
        ContactsLocalImpl(contactsDao = contactsDao)
}