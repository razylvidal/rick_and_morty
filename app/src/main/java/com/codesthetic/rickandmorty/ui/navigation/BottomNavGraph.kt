package com.codesthetic.rickandmorty.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.codesthetic.rickandmorty.ui.home.BottomBarNavigator
import com.codesthetic.rickandmorty.ui.home.screens.CharacterScreen
import com.codesthetic.rickandmorty.ui.home.screens.EpisodesScreen
import com.codesthetic.rickandmorty.ui.home.screens.LocationScreen

@Composable
fun BottomNavGraph(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = BottomBarNavigator.Characters.route ){
        composable(route = BottomBarNavigator.Characters.route){
            CharacterScreen()
        }
        composable(route = BottomBarNavigator.Location.route){
            LocationScreen()
        }
        composable(route = BottomBarNavigator.Episode.route){
            EpisodesScreen()
        }
    }
}