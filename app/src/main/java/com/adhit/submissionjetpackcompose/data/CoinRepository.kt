package com.adhit.submissionjetpackcompose.data

import com.adhit.submissionjetpackcompose.model.Coin
import com.adhit.submissionjetpackcompose.model.CoinData
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf

class CoinRepository {
    private val dummyCoin = mutableListOf<Coin>()

    init {
        if (dummyCoin.isEmpty()) {
            CoinData.dummyCoin.forEach {
                dummyCoin.add(it)
            }
        }
    }

    fun getCoinById(coinId: Int): Coin {
        return dummyCoin.first {
            it.id == coinId
        }
    }

    fun getFavoriteCoin(): Flow<List<Coin>> {
        return flowOf(dummyCoin.filter { it.isFavorite })
    }

    fun searchCoin(query: String) = flow {
        val data = dummyCoin.filter {
            it.name.contains(query, ignoreCase = true)
        }
        emit(data)
    }

    fun updateCoin(coinId: Int, newState: Boolean): Flow<Boolean> {
        val index = dummyCoin.indexOfFirst { it.id == coinId }
        val result = if (index >= 0) {
            val coin = dummyCoin[index]
            dummyCoin[index] = coin.copy(isFavorite = newState)
            true
        } else {
            false
        }
        return flowOf(result)
    }

    companion object {
        @Volatile
        private var instance: CoinRepository? = null

        fun getInstance(): CoinRepository =
            instance ?: synchronized(this) {
                CoinRepository().apply {
                    instance = this
                }
            }
    }
}