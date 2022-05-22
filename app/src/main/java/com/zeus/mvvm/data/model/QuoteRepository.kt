package com.zeus.mvvm.data.model

import com.zeus.mvvm.data.model.network.QuoteService

class QuoteRepository {
    private val api=QuoteService()
    suspend fun getAllQuotes():List<QuoteModel>{
        val response =api.getQuotes()
        QuoteProvider.quotes=response
        return response
    }
}