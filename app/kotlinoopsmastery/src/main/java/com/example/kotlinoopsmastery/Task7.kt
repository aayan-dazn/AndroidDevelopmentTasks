package com.example.kotlinoopsmastery

sealed class DeliveryState{
    object Pending : DeliveryState()
    data class Shipped (val trackingId:String) : DeliveryState()
    data class Delivered (val deliveredOn: String) : DeliveryState()
}

data class Package(
    val id:String,
    val state: DeliveryState
)

fun main(){
    val pkg1 = Package("pkg1", DeliveryState.Pending)

    val pkg2 = Package("pkg2", DeliveryState.Shipped("trk123"))

    val pkg3 = Package("pkg3", DeliveryState.Delivered("30-Jan-2026"))

    printStatus(pkg1)
    printStatus(pkg2)
    printStatus(pkg3)
}

fun printStatus(pkg: Package){
    when(pkg.state){
        is DeliveryState.Pending -> println("Package is pending")
        is DeliveryState.Shipped -> println("Shipped with Id : ${pkg.state.trackingId}")
        is DeliveryState.Delivered -> println("Delivered on : ${pkg.state.deliveredOn}")
    }
}