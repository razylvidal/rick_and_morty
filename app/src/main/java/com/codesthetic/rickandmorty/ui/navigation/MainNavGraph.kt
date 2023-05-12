package com.codesthetic.rickandmorty.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.codesthetic.rickandmorty.ui.RickAndMortySplashScreen
import com.codesthetic.rickandmorty.ui.home.MainScreen

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
            MainScreen()
        }
    }
}