package com.example.mvvmangelnahuat.domain

import com.example.mvvmangelnahuat.data.model.QuoteModel
import com.example.mvvmangelnahuat.data.model.QuoteRepository

class GetQuotesUseCase {
    private val repository=QuoteRepository()
    suspend operator fun invoke():List<QuoteModel>?= repository.getAllQuotes()

}