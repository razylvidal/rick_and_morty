package com.codesthetic.rickandmorty.ui.home

import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import com.codesthetic.rickandmorty.ui.theme.ThemeColor1
import com.codesthetic.rickandmorty.ui.theme.ThemeColor8

@Composable
fun TopBar(){
    TopAppBar(
        title = {
            Text(
                text = "Rick And Morty",
                fontSize = 18.sp,
                color = ThemeColor8,
                fontFamily = FontFamily.Monospace
            )
        },
        backgroundColor = ThemeColor1,
        contentColor = ThemeColor1
    )
}