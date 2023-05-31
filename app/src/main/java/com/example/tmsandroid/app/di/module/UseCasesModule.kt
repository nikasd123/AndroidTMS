package com.example.tmsandroid.app.di.module

import com.example.tmsandroid.app.domain.repository.ContactRepository
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
    fun provideContactInfoUseCase(contactRepository: ContactRepository) =
        GetContactInfoUseCase(contactRepository = contactRepository)

    @Provides
    fun provideContactsUseCase(contactRepository: ContactRepository) =
        ContactUseCase(contactRepository = contactRepository)
}