package com.codesthetic.rickandmorty.ui.home.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.codesthetic.rickandmorty.ui.components.characterscreen.SearchView
import com.codesthetic.rickandmorty.ui.components.characterscreen.SortBy
import com.codesthetic.rickandmorty.ui.theme.ThemeColor1
import com.codesthetic.rickandmorty.ui.theme.ThemeColor6

@Composable
fun CharacterScreen() {
    Surface(
        color = ThemeColor1,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(modifier = Modifier.padding(20.dp, 0.dp)) {
            val textState = remember { mutableStateOf(TextFieldValue("")) }
            Spacer(modifier = Modifier.height(70.dp))
            Row(verticalAlignment = Alignment.CenterVertically){
                SearchView(textState)
                Spacer(modifier = Modifier.padding(5.dp))
                SortBy()
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(verticalAlignment = Alignment.Bottom) {
                Text(
                    modifier = Modifier.padding(0.dp, 0.dp, 190.dp, 0.dp),
                    text = "Characters",
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    fontSize = 20.sp
                )
                Text(
                    text = "Default",
                    fontWeight = FontWeight.Bold,
                    color = ThemeColor6,
                    fontSize = 16.sp
                )
            }
        }
    }

}

@Preview
@Composable
fun CharacterScreenPreview() {
    CharacterScreen()
}