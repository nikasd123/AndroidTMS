package com.example.tmsandroid.app.data.local

import androidx.room.*

@Dao
interface ContactsDao {
    @Query("SELECT * FROM contactentity")
    suspend fun getAll(): List<ContactEntity>?

    @Query("SELECT * FROM contactentity WHERE id = :contactId")
    suspend fun getById(contactId: Long): ContactEntity?

    @Insert
    suspend fun insert(contactEntity: ContactEntity?)

    @Update
    suspend fun update(contactEntity: ContactEntity?)

    @Delete
    suspend fun delete(contactEntity: ContactEntity?)
}