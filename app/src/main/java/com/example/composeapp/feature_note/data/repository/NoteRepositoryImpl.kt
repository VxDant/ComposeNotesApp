package com.example.composeapp.feature_note.data.repository

import com.example.composeapp.feature_note.data.data_source.NoteDao
import com.example.composeapp.feature_note.domain.model.Note
import com.example.composeapp.feature_note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(private  val dao : NoteDao) : NoteRepository {
    override fun getAllNotes(): Flow<List<Note>> {
        return dao.getAllNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteByID(id)
    }

    override suspend fun upsertNote(note: Note) {
        return dao.upsertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        return dao.deleteNote(note)
    }
}