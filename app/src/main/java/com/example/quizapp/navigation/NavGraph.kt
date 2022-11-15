package com.example.quizapp.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.quizapp.screen.HomeScreen
import com.example.quizapp.screen.Quiz_Categories
import com.example.quizapp.screen.SignUpScreen
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
        composable(route = Screen.Sign_Up.route){
            SignUpScreen()
        }
        composable(route = Screen.Quiz_Categories.route) {
            Quiz_Categories()
        }
    }
}