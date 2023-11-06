package com.example.composeapp.repository

import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    suspend fun insertNote(note : ItemNote)
    suspend fun deleteNote(note : ItemNote)
    suspend fun getAllNotes() : Flow<List<ItemNote>>
}