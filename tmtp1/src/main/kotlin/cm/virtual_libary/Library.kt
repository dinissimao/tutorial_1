package org.example.cm.virtual_libary

class Library {
    private val books = mutableListOf<Book>()

    fun addBook(book: Book) {
        books.add(book)
        println("Book added: ${book.getDetails()}")
    }

    fun removeBook(id: Int) {
        val book = books.find { it.id == id }
        if (book != null) {
            books.remove(book)
            println("Book removed: ${book.getDetails()}")
        } else {
            println("Book with ID $id not found.")
        }
    }

    fun listBooks() {
        if (books.isEmpty()) {
            println("No books available.")
        } else {
            books.forEach { println(it.getDetails()) }
        }
    }
}

