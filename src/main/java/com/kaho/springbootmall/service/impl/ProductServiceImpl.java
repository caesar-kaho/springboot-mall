package com.kaho.springbootmall.service.impl;

import com.kaho.springbootmall.dao.ProductDao;
import com.kaho.springbootmall.dto.ProductRequest;
import com.kaho.springbootmall.model.Product;
import com.kaho.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }
}
