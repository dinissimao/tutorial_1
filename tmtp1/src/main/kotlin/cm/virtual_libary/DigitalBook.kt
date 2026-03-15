package org.example.cm.virtual_libary

class DigitalBook(
    id: Int,
    title: String,
    author: String,
    year: Int,
    val fileFormat: String,
    val fileSize: Double
) : Book(id, title, author, year) {
    override fun getDetails(): String {
        return super.getDetails() + ", Format: $fileFormat, Size: $fileSize MB"
    }
}