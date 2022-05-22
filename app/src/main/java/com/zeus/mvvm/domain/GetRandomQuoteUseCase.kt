package com.zeus.mvvm.domain

import com.zeus.mvvm.data.model.QuoteModel
import com.zeus.mvvm.data.model.QuoteProvider
import com.zeus.mvvm.data.model.QuoteRepository

class GetRandomQuoteUseCase {
    private val repository=QuoteRepository()
    operator fun invoke(): QuoteModel?{
        val quotes=QuoteProvider.quotes
        if(!quotes.isNullOrEmpty()){
            val randomNumber:Int=(quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }
}