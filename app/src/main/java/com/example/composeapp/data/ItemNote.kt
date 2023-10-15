package com.example.composeapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
data class ItemNote (
    @PrimaryKey(autoGenerate = true)
    val id : Int = 0,
    val content :String
        )
