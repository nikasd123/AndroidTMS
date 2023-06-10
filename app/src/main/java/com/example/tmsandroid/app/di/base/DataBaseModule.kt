package com.example.tmsandroid.app.di.base

import android.content.Context
import androidx.room.Room
import com.example.tmsandroid.app.data.local.ContactEntity
import com.example.tmsandroid.app.data.local.ContactsDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataBaseModule {

    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext context: Context
    ): ContactsDatabase =
        Room.databaseBuilder(
            context, ContactsDatabase::class.java,
            "contacts_db"
        ).fallbackToDestructiveMigration()
            .build()

    @Provides
    @Singleton
    fun provideDao(db: ContactsDatabase) = db.contactsDao()

    @Provides
    fun provideEntity() = ContactEntity()
}