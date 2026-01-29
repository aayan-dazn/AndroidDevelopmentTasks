package com.example.jetpack_compose_mastery.ui.task5_screens


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
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
import com.example.jetpack_compose_mastery.movieData
import com.example.jetpack_compose_mastery.models.Screen

@Composable
fun MoviesList(navController: NavController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
    ) {
        Column() {
            Text("Movies List Screen",
                fontSize = 32.sp,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(8.dp))
            LazyColumn {
                items(movieData.movies) { movie ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                            .clickable {
                                navController.currentBackStackEntry?.savedStateHandle?.set("movie",movie)
                                navController.navigate(
                                    Screen.MovieDetails.createRoute(movie.id)
                                )
                            }
                    ) {
                        Column(modifier = Modifier.padding(16.dp)) {

                            Text(
                                text = movie.title,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )

                            Text(
                                text = movie.genre,
                                fontSize = 14.sp
                            )
                            Row() {
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
                        }
                    }
                }
            }
        }
    }
}
