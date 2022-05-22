package com.zeus.mvvm.domain

import com.zeus.mvvm.data.model.QuoteModel
import com.zeus.mvvm.data.model.QuoteRepository

class GetQuotesUseCase {
    private val repository=QuoteRepository()
    suspend operator fun invoke():List<QuoteModel>?= repository.getAllQuotes()

}