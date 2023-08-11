package com.kaho.springbootmall.service;

import com.kaho.springbootmall.dto.ProductQueryParams;
import com.kaho.springbootmall.dto.ProductRequest;
import com.kaho.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductQueryParams productQueryParams);
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

}
