package com.example.composeapp.data


import androidx.compose.ui.graphics.vector.ImageVector

data class TabRowItem (
    val title : String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
)