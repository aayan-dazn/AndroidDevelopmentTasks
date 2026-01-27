package com.example.kotlinoopsmastery

// abstract class
abstract class Shape{
    // abstract function
    abstract fun area() : Double
    abstract fun perimeter(): Double
    // concrete function

    fun display(){
        println("Area: ${area()}")
        println("Perimeter: ${perimeter()}")
    }
}

//concrete classes
class Circle(private val radius:Double) : Shape(){
    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun perimeter(): Double {
        return 2 * Math.PI * radius
    }
}

class Square(private val side: Double) : Shape() {

    override fun area(): Double {
        return side * side
    }

    override fun perimeter(): Double {
        return 4 * side
    }
}

fun main() {
    val shape1: Shape = Circle(5.0)
    val shape2: Shape = Square(4.0)

    println("Circle:")
    shape1.display()

    println("\nSquare:")
    shape2.display()
}
