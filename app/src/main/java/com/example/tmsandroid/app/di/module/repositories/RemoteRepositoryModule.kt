package com.example.tmsandroid.app.di.module.repositories

import com.example.tmsandroid.app.data.repository.remote.ContactsRemote
import com.example.tmsandroid.app.data.repository.remote.ContactsRemoteImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class RemoteRepositoryModule {

    @Provides
    fun provideContactsRemote(): ContactsRemote = ContactsRemoteImpl()
}