package com.example.kotlinoopsmastery

interface PaymentProcessor{
    fun processPayment(amount: Double)
}

class PayPal(private val email:String) : PaymentProcessor{
    override fun processPayment(amount: Double) {
        println("Processing PayPal payment of $$amount for account $email")
    }
}

class CreditCard(
    private val cardNumber: String,
    private val cardHolder: String
) : PaymentProcessor{
    override fun processPayment(amount: Double) {
        println("Processing Credit Card($cardNumber) payment of ₹$amount for $cardHolder")
    }
}

fun main() {
    val payment1: PaymentProcessor = PayPal("aayan@gmail.com")
    val payment2: PaymentProcessor = CreditCard("1234-5678-9012", "Aayan")

    payment1.processPayment(1500.0)
    payment2.processPayment(3200.0)
}
