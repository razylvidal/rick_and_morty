package com.codesthetic.rickandmorty.ui

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale.Companion.Fit
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.codesthetic.rickandmorty.R
import com.codesthetic.rickandmorty.ui.navigation.Screens
import kotlinx.coroutines.delay


@Composable
fun RickAndMortySplashScreen(navController: NavHostController) {
    var startAnimation by remember { mutableStateOf(false) }
    val alphaAnim = animateFloatAsState(
        targetValue = if(startAnimation) 1f else 0f,
        animationSpec = tween(durationMillis = 1000)
    )

    LaunchedEffect(key1 = true){
        startAnimation = true
        delay(2000)
        navController.popBackStack()
        navController.navigate(Screens.Home.route)
    }
    Splash(alphaAnim.value)
}

@Composable
fun Splash(alpha : Float) {
    Box(
        modifier = Modifier
            .background(Color.Black)
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.rick_and_morty),
            contentDescription = "",
            contentScale = Fit,
            modifier = Modifier.fillMaxSize(),
            alpha = alpha
        )

        Text(
            text = "App Version : "
        )

    }
}

@Preview
@Composable
fun Preview() {
    Splash(alpha = 1f)
}