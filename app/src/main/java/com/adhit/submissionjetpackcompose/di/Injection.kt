package com.adhit.submissionjetpackcompose.di

import com.adhit.submissionjetpackcompose.data.CoinRepository


object Injection {
    fun provideRepository(): CoinRepository {
        return CoinRepository.getInstance()
    }
}