package com.example.jetpack_compose_mastery.task5_screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jetpack_compose_mastery.task5_models.Movy

@Composable
fun MovieDetails(movieId: Int,navController: NavController) {

//    1. Getting data from movieDataObject using id received from route

//    val movie = movieData.movies.find {
//        it.id == movieId
//    }

//    2. Getting data using Parcelable (savedStateHandle)
    val movie = navController.previousBackStackEntry?.savedStateHandle?.get<Movy>("movie")
//    Log.i("movie","$movie")

    movie?.let {
        Surface(
            modifier = Modifier.fillMaxSize(),
        ) {
            Column() {
                Text(
                    "Movie Details Screen",
                    fontSize = 32.sp,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(8.dp)
                )
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ) {
                    Text(
                        text = it.title,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Text("Release Year: ${it.releaseYear}")
                    Row() {
                        Text("Rating: ")
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "Rating Star"
                        )
                        Spacer(Modifier.width(2.dp))
                        Text(
                            text = " ${movie.rating}",
                            fontSize = 14.sp
                        )
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    Text(text = it.description)
                }
            }
        }
    }
}


