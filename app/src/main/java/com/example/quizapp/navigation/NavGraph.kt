package com.example.quizapp.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.quizapp.screen.HomeScreen
import com.example.quizapp.screen.WelcomeScreen
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun SetupNavGraph(
    navController: NavHostController,
    startDestination: String
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(route = com.example.quizapp.navigation.Screen.Welcome.route) {
            WelcomeScreen(navController = navController)
        }
        composable(route = com.example.quizapp.navigation.Screen.Home.route) {
            HomeScreen()
        }
    }
}