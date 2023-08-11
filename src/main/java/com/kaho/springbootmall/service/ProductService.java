package com.kaho.springbootmall.service;

import com.kaho.springbootmall.constant.ProductCategory;
import com.kaho.springbootmall.dto.ProductRequest;
import com.kaho.springbootmall.model.Product;

import java.net.Inet4Address;
import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category, String search);
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

}
