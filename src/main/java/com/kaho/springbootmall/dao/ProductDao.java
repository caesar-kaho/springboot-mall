package com.kaho.springbootmall.dao;

import com.kaho.springbootmall.dto.ProductQueryParams;
import com.kaho.springbootmall.dto.ProductRequest;
import com.kaho.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Integer countProduct(ProductQueryParams productQueryParams);
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

}
