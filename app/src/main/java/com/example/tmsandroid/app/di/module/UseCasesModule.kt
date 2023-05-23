package com.example.tmsandroid.app.di.module

import com.example.tmsandroid.app.domain.repository.ContactsRepository
import com.example.tmsandroid.app.domain.use_cases.ContactUseCase
import com.example.tmsandroid.app.domain.use_cases.GetContactInfoUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class UseCasesModule {
    @Provides
    fun provideContactInfoUseCase(contactsRepository: ContactsRepository) =
        GetContactInfoUseCase(contactsRepository = contactsRepository)

    @Provides
    fun provideContactsUseCase(contactRepository: ContactsRepository) =
        ContactUseCase(contactsRepository = contactRepository)
}