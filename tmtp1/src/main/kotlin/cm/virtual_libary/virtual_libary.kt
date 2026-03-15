package org.example.cm.virtual_libary

fun main() {
    val library = Library()

    val book1 = PhysicalBook(1, "1984", "George Orwell", 1949, 328, 0.6)
    val book2 = DigitalBook(2, "The Hobbit", "J.R.R. Tolkien", 1937, "PDF", 2.5)

    library.addBook(book1)
    library.addBook(book2)

    println("\nListing all books:")
    library.listBooks()

    library.removeBook(1)

    println("\nListing all books after removal:")
    library.listBooks()
}