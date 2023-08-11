package com.kaho.springbootmall.dao;

import com.kaho.springbootmall.constant.ProductCategory;
import com.kaho.springbootmall.dto.ProductRequest;
import com.kaho.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category, String search);
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

}
