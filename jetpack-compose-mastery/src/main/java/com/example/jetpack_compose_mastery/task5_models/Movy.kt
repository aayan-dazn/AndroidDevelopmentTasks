package com.example.jetpack_compose_mastery.task5_models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Movy(
    val description: String,
    val director: String,
    val durationMinutes: Int,
    val genre: String,
    val id: Int,
    val language: String,
    val rating: Double,
    val releaseYear: Int,
    val title: String
): Parcelable