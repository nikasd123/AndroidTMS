package com.example.tmsandroid.app.di.module.repositories

import com.example.tmsandroid.app.data.repository.ContactsRepositoryImpl
import com.example.tmsandroid.app.data.repository.remote.ContactsRemote
import com.example.tmsandroid.app.domain.repository.ContactRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    fun provideContactsRepository(contactsRemote: ContactsRemote): ContactRepository =
        ContactsRepositoryImpl(contactsRemote = contactsRemote)

}