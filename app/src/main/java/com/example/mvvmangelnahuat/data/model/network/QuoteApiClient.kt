package com.example.mvvmangelnahuat.data.model.network

import com.example.mvvmangelnahuat.core.RetrofitHelper
import com.example.mvvmangelnahuat.data.model.QuoteModel

import retrofit2.http.GET

interface QuoteApiClient {
    @GET("/.json")
    suspend fun getAllQuotes():retrofit2.Response<List<QuoteModel>>
}
