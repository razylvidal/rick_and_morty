package com.codesthetic.rickandmorty.ui.home.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun EpisodesScreen(){
    Box(
        modifier = Modifier.fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Episodes Screen",
            fontSize = MaterialTheme.typography.h5.fontSize,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )
    }

}

@Preview
@Composable
fun EpisodeScreenPreview(){
    EpisodesScreen()
}