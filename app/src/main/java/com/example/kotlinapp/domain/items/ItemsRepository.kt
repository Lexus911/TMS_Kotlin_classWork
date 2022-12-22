package com.example.kotlinapp.domain.items

import com.example.kotlinapp.model.ItemsModel

interface ItemsRepository {
    fun getData():List<ItemsModel>
}