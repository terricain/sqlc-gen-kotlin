// Code generated by sqlc. DO NOT EDIT.
// versions:
//   sqlc v1.23.0

package com.example.booktest.mysql

import java.time.LocalDateTime

enum class BooksBookType(val value: String) {
  FICTION("FICTION"),
  NONFICTION("NONFICTION");

  companion object {
    private val map = BooksBookType.values().associateBy(BooksBookType::value)
    fun lookup(value: String) = map[value]
  }
}

data class Author (
  val authorId: Int,
  val name: String
)

data class Book (
  val bookId: Int,
  val authorId: Int,
  val isbn: String,
  val bookType: BooksBookType,
  val title: String,
  val yr: Int,
  val available: LocalDateTime,
  val tags: String
)

