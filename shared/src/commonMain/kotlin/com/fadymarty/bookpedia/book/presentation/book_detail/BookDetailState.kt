package com.fadymarty.bookpedia.book.presentation.book_detail

import com.fadymarty.bookpedia.book.domain.Book

data class BookDetailState(
    val isLoading: Boolean = true,
    val isFavorite: Boolean = false,
    val book: Book? = null
)