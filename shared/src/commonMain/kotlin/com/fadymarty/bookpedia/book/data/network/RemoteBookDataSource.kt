package com.fadymarty.bookpedia.book.data.network

import com.fadymarty.bookpedia.book.data.dto.BookWorkDto
import com.fadymarty.bookpedia.book.data.dto.SearchResponseDto
import com.fadymarty.bookpedia.core.domain.DataError
import com.fadymarty.bookpedia.core.domain.Result

interface RemoteBookDataSource {
    suspend fun searchBooks(
        query: String,
        resultLimit: Int? = null
    ): Result<SearchResponseDto, DataError.Remote>

    suspend fun getBookDetails(bookWorkId: String): Result<BookWorkDto, DataError.Remote>
}