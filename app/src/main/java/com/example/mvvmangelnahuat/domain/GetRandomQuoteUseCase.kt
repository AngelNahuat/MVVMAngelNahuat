package com.example.mvvmangelnahuat.domain

import com.example.mvvmangelnahuat.data.model.QuoteModel
import com.example.mvvmangelnahuat.data.model.QuoteProvider
import com.example.mvvmangelnahuat.data.model.QuoteRepository
import com.example.mvvmangelnahuat.ui.viewmodel.QuoteViewModel

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