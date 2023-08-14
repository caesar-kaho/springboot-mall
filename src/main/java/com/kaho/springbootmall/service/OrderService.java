package com.kaho.springbootmall.service;

import com.kaho.springbootmall.dto.CreateOrderRequest;
import com.kaho.springbootmall.dto.OrderQueryParams;
import com.kaho.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Integer countOrder(OrderQueryParams orderQueryParams);
}
