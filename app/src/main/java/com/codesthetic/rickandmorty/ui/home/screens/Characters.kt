package com.codesthetic.rickandmorty.ui.home.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codesthetic.rickandmorty.ui.components.characterscreen.SearchView

@Composable
fun CharacterScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.Top,
            modifier = modifier.padding(20.dp, 70.dp, 20.dp, 10.dp)
        ) {
            SearchView()
        }
    }
}

@Preview
@Composable
fun CharacterScreenPreview() {
    CharacterScreen()
}
