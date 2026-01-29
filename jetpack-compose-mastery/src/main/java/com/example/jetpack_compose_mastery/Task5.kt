package com.example.jetpack_compose_mastery

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.jetpack_compose_mastery.sampledata.moviesData
import com.example.jetpack_compose_mastery.models.task5_models.MovieModel
import com.example.jetpack_compose_mastery.ui.task5_screens.MoviesList
import com.google.gson.Gson

val movieData = Gson().fromJson(moviesData, MovieModel::class.java)

@Composable
fun Task5(navController: NavController) {
    MoviesList(navController)
}