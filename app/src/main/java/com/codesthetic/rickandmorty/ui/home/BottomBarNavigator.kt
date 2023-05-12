package com.codesthetic.rickandmorty.ui.home

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Movie
import androidx.compose.material.icons.filled.MyLocation
import androidx.compose.material.icons.filled.PeopleOutline
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarNavigator(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Characters : BottomBarNavigator(
        route = "characters",
        title = "Characters",
        icon = Icons.Default.PeopleOutline,
    )

    object Location : BottomBarNavigator(
        route = "location",
        title = "Location",
        icon = Icons.Default.MyLocation
    )

    object Episode : BottomBarNavigator(
        route = "episodes",
        title = "Episodes",
        icon = Icons.Default.Movie
    )
}