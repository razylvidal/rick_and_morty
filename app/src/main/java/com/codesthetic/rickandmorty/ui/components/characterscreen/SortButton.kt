package com.codesthetic.rickandmorty.ui.components.characterscreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Sort
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codesthetic.rickandmorty.ui.theme.ThemeColor6

@Composable
fun SortBy() {
    Box(contentAlignment = Alignment.Center, modifier = Modifier.size(55.dp)) {
        Button(
            shape = RoundedCornerShape(15.dp),
            onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxSize(),
            colors = ButtonDefaults.buttonColors(
                containerColor = ThemeColor6
            )
        ) {
            Icon(
                Icons.Filled.Sort,
                contentDescription = null,
                modifier = Modifier.wrapContentSize(
                    Alignment.Center, true
                ),
                tint = Color.White
            )
        }
    }
}

@Preview
@Composable
fun SortByButtonPreview(){
    SortBy()
}