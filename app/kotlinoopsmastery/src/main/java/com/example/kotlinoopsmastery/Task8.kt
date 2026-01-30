package com.example.kotlinoopsmastery

data class Product(
    val id:Int,
    val name:String,
    val category: String,
    val price: Int
)

fun main(){
    val productData = List(50){ index ->
        Product(
            id=index,
            name="Product $index",
            category = if(index%2==0) "Electronics" else "Clothing",
            price = (100..5000).random()
        )
    }

    val electronicProducts = productData.filter { it.category == "Electronics" }

    val affordable = productData.filter { it.price in  100 .. 2000}

    val cheapFirst = productData.sortedBy { it.price }

    val expensiveFirst = productData.sortedByDescending { it.price }

    val cheapClothes = productData
        .sortedBy { it.price }
        .filter { it.category=="Electronics" }

    println("Electronic Products:\n $electronicProducts")
    println("Affordable Products:\n $affordable")
    println("Cheap Products:\n $cheapFirst")
    println("Expensive Products:\n $expensiveFirst")
    println("Cheap Clothes:\n $cheapClothes")
}