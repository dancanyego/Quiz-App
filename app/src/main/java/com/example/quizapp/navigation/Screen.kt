package com.example.quizapp.navigation

sealed class Screen(val route: String) {
    object Welcome : Screen(route = "welcome_screen")
    object Home : Screen(route = "home_screen")
    object Sign_Up : Screen(route = "SignUp_Screen")
    object Quiz_Categories : Screen(route = "QuizCategories_Screen")
}