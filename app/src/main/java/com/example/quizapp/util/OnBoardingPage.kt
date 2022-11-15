package com.example.quizapp.util

import androidx.annotation.DrawableRes
import com.example.quizapp.R

sealed class OnBoardingPage(
    @DrawableRes
    val image: Int,
    val title: String,
    val description: String
) {
    object First : OnBoardingPage(
        image = R.drawable.first,
        title = "The Best Quizes",
        description = "The Best Place for Quizes To Test Your Brain."
    )

    object Second : OnBoardingPage(
        image = R.drawable.second,
        title = "Quiz Categories",
        description = "Our Quizes have the Best Categories From Where you Choose."
    )

    object Third : OnBoardingPage(
        image = R.drawable.third,
        title = "Grade",
        description = "Check Your grade In The Grading section."
    )
}