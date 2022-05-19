package com.example.mvvmangelnahuat.data.model

import com.example.mvvmangelnahuat.data.model.network.QuoteService

class QuoteRepository {
    private val api=QuoteService()
    suspend fun getAllQuotes():List<QuoteModel>{
        val response =api.getQuotes()
        QuoteProvider.quotes=response
        return response
    }
}