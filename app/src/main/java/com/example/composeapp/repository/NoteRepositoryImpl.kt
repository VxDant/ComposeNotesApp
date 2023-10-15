package com.example.composeapp.repository

import android.provider.ContactsContract
import com.example.composeapp.dao.NotesDao
import com.example.composeapp.data.ItemNote
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(private val dao: NotesDao) : NoteRepository {
    override suspend fun insertNote(note: ItemNote) {
        return dao.upsertNote(note)
    }

    override suspend fun deleteNote(note: ItemNote) {
        return dao.deleteNote(note)
    }

    override suspend fun getAllNotes(): Flow<List<ItemNote>> {

        return dao.getAllNotes()
    }


}