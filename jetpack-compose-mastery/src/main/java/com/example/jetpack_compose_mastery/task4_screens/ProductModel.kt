package com.example.jetpack_compose_mastery.task4_screens

data class ProductModel(
    val limit: Int,
    val products: List<Product>,
    val skip: Int,
    val total: Int
)