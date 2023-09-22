package com.vixiloc.ekasir.domain.model

data class Product(
    val id: Int,
    val name: String,
    val categoryId: Int,
    val price: List<Price>
)