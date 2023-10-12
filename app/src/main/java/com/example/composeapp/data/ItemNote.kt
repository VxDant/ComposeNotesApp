package com.example.composeapp.data

import androidx.room.PrimaryKey

data class ItemNote (
    @PrimaryKey(autoGenerate = true)
    val id : Int = 0,
    val content :String
        )
