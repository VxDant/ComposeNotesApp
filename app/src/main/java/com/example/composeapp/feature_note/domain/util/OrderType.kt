package com.example.composeapp.feature_note.domain.util

sealed class OrderType {

    object Ascending : OrderType()
    object Descending : OrderType()
}