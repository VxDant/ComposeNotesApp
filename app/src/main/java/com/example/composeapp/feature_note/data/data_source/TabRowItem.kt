package com.example.composeapp.feature_note.data.data_source


import androidx.compose.ui.graphics.vector.ImageVector

data class TabRowItem (
    val title : String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
)