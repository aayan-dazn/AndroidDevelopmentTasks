package com.example.kotlinoopsmastery

data class UserProfile(
    val name:String?,
    val age:Int?,
    val email:String?,
    val isPremiumUser: Boolean?
)

fun printUserProfile(user: UserProfile){
    val name = user.name?:"Guest"
    val age = user.age?:0
    val email = user.email?:"not Provided"
    val membership = user.isPremiumUser?:false

    println("User Profile - ")
    println("Name: $name")
    println("Age: $age")
    println("Email: $email")
    println("Memebership: ${
        if(membership) "Premium" else "Free"
    }")
}

fun main(){
    val user1 = UserProfile(
        name = null,
        age = null,
        email = null,
        isPremiumUser = null
    )

    val user2 = UserProfile(
        name = "Aayan Patel",
        age = 21,
        email = "aayan.patel@ext.dazn.com",
        isPremiumUser = true
    )

    printUserProfile(user1)
    printUserProfile(user2)
}