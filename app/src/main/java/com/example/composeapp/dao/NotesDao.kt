package com.example.composeapp.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.example.composeapp.data.ItemNote
import kotlinx.coroutines.flow.Flow

@Dao
interface NotesDao {

    @Upsert
    suspend fun upsertNote(note : ItemNote)

    @Delete
    suspend fun deleteNote(note : ItemNote)

    @Query("SELECT * FROM notes")
    suspend fun getAllNotes() : Flow<List<ItemNote>>
}