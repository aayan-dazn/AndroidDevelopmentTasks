package com.example.kotlinoopsmastery

// Library System
class Book(
    val id: Int,
    val title: String,
    val author: String,
    var isIssued: Boolean = false
){
    fun displayBook(){
        println("Book ID: $id, Title: $title, Author: $author, Issued: $isIssued")
    }
}

class Member(
    val memberId: Int,
    val name: String
) {
    fun issueBook(book: Book) {
        if (!book.isIssued) {
            book.isIssued = true
            println("$name with member id = $memberId has issued the book '${book.title}'")
        } else {
            println("Book '${book.title}' is already issued")
        }
    }

    fun returnBook(book: Book) {
        if (book.isIssued) {
            book.isIssued = false
            println("$name with member id = $memberId has returned the book '${book.title}'")
        } else {
            println("Book '${book.title}' was not issued")
        }
    }
}

fun main() {
    val book1 = Book(101, "Clean Code", "Robert C. Martin")
    val book2 = Book(102, "Kotlin in Action", "Dmitry Jemerov")

    val member1 = Member(1, "Aayan")
    val member2 = Member(2, "Abhash")

    book1.displayBook()
    member1.issueBook(book1)
    book1.displayBook()
    member1.returnBook(book1)
    book1.displayBook()

    member2.returnBook(book2)

    book2.displayBook()
    member2.issueBook(book2)
    book2.displayBook()
    member2.returnBook(book2)
    book2.displayBook()
}
