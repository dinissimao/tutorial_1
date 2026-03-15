package org.example.cm.virtual_libary

class PhysicalBook(
    id: Int,
    title: String,
    author: String,
    year: Int,
    val pages: Int,
    val weight: Double // Peso em kg
) : Book(id, title, author, year) {

    override fun getDetails(): String {
        return super.getDetails() + ", Pages: $pages, Weight: $weight kg"
    }
}