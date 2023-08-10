package com.kaho.springbootmall.dao;

import com.kaho.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
