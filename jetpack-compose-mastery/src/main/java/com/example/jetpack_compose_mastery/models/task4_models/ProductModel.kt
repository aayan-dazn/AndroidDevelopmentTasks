package com.example.jetpack_compose_mastery.models.task4_models

data class ProductModel(
    val limit: Int,
    val products: List<Product>,
    val skip: Int,
    val total: Int
)