package com.kaho.springbootmall.dao;

import com.kaho.springbootmall.dto.ProductRequest;
import com.kaho.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
