package com.kaho.springbootmall.service;

import com.kaho.springbootmall.dto.ProductRequest;
import com.kaho.springbootmall.model.Product;

import java.net.Inet4Address;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
