package com.codesthetic.rickandmorty.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codesthetic.rickandmorty.ui.theme.ThemeColor2
import me.vponomarenko.compose.shimmer.shimmer

@Composable
fun CharacterListShimmer() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .shimmer()

    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .height(120.dp)
                .background(color = ThemeColor2)
        )
    }
}

@Preview
@Composable
fun CharacterListShimmerPreview() {
    CharacterListShimmer()
}