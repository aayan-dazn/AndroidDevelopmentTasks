package com.example.kotlinoopsmastery

// Library System
class NewBook(
    val id: Int,
    val title: String,
    val author: String,
    var isIssued: Boolean = false
) {
    fun displayBook() = println(
        "Book ID: $id, Title: $title, Author: $author, Issued: $isIssued"
    )
}

class NewMember(
    val memberId: Int,
    val name: String
) {

    fun issueBook(book: NewBook) = book.run {
        if (!isIssued) {
            isIssued = true
            println("$name with member id = $memberId has issued the book '$title'")
        } else {
            println("Book '$title' is already issued")
        }
    }

    fun returnBook(book: NewBook) = book.run { // use when need to return result using object
        if (isIssued) {
            isIssued = false
            println("$name with member id = $memberId has returned the book '$title'")
        } else {
            println("Book '$title' was not issued")
        }
    }
}

fun main() {

    val book1 = NewBook(101, "Clean Code", "Robert C. Martin")
    val book2 = NewBook(102, "Kotlin in Action", "Dmitry Jemerov")

    val member1 = NewMember(1, "Aayan")
    val member2 = NewMember(2, "Abhash")
    val member3 = NewMember(3, "Aadi")


    book1.apply {                              // configure this object so not to write it each time
        displayBook()
        member1.issueBook(this)
        displayBook()
        member1.returnBook(this)
        displayBook()
    }

    println()

    book2.also {                              // used for side effects like logging,analytics and debugging (Do something extra without changing the object)
        member2.returnBook(it)
    }.apply {
        displayBook()
        member2.issueBook(this)
        displayBook()
        member2.returnBook(this)
        displayBook()
    }
    println()
    book1.let {                               // use this value safely and maybe transform it
        it.displayBook()
        member3.issueBook(it)
        it.displayBook()
    }
    println()
    with(book1){                   // to group operations and multiple calls on non null objects
        member1.returnBook(this)
        displayBook()
    }
}



// only let,also have 'it' as a receiver inside block other have 'this'
// only apply,also does not return lambda others do
// let(most),run,also are null safe friendly
