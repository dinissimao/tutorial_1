package org.example.cm.virtual_libary

open class Book(
    val id: Int,
    val title: String,
    val author: String,
    val year: Int
) {
    open fun getDetails(): String {
        return "ID: $id, Title: $title, Author: $author, Year: $year"
    }
}