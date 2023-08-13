package com.kaho.springbootmall.service;

import com.kaho.springbootmall.dto.CreateOrderRequest;
import com.kaho.springbootmall.model.Order;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);
}
