package com.vixiloc.ekasir.domain.repository

import com.vixiloc.ekasir.data.remote.dto.ProductDto

interface ProductRepository {

    fun getProducts(): List<ProductDto>

    fun getProduct(id: String): ProductDto

}