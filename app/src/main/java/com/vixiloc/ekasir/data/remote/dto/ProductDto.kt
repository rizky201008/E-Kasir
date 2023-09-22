package com.vixiloc.ekasir.data.remote.dto

data class ProductDto(
    val id: Int,
    val name: String,
    val categoryId: Int,
    val price: List<PriceDto>
)