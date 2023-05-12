package com.codesthetic.rickandmorty.ui.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.codesthetic.rickandmorty.RickAndMortySplashScreen

@Composable
fun SetupNavGraph(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = Screens.Splash.route
    ){
        composable(route = Screens.Splash.route){
            RickAndMortySplashScreen(navController)
        }
        composable(route = Screens.Home.route){
            Box(modifier = Modifier.fillMaxSize())
        }
    }
}