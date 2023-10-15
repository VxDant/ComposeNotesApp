package com.example.composeapp.repository

import com.example.composeapp.data.ItemNote
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    suspend fun insertNote(note : ItemNote)
    suspend fun deleteNote(note : ItemNote )
    suspend fun getAllNotes() : Flow<List<ItemNote>>
}