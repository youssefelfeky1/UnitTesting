package com.elfeky.unittesting.repository

import androidx.lifecycle.LiveData
import com.elfeky.unittesting.data.local.ShoppingItem
import com.elfeky.unittesting.data.remote.response.ImageResponse
import com.elfeky.unittesting.other.Resource

interface ShoppingRepository {
    suspend fun insertShoppingItem(shoppingItem: ShoppingItem)

    suspend fun deleteShoppingItem(shoppingItem: ShoppingItem)

    fun observeAllShoppingItems(): LiveData<List<ShoppingItem>>

    fun observeTotalPrice(): LiveData<Float>

    suspend fun searchForImage(imageQuery: String): Resource<ImageResponse>
}