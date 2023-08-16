package com.kaho.springbootmall.controller;

import com.kaho.springbootmall.dto.CreateOrderRequest;
import com.kaho.springbootmall.dto.OrderQueryParams;
import com.kaho.springbootmall.model.Order;
import com.kaho.springbootmall.service.OrderService;
import com.kaho.springbootmall.util.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.List;

@Api(tags = "Order APIs")
@Validated
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @ApiOperation("get order by Id")
    @ApiResponses({@ApiResponse(code=200,message = "get order by Id successfully")})
    @GetMapping("/users/{userId}/orders")
    public ResponseEntity<Page<Order>> getOrders(@PathVariable Integer userId,
                                                 @RequestParam(defaultValue = "10") @Max(1000) @Min(0) Integer limit,
                                                 @RequestParam(defaultValue = "0") @Min(0) Integer offset) {

        OrderQueryParams orderQueryParams = new OrderQueryParams();
        orderQueryParams.setUserId(userId);
        orderQueryParams.setLimit(limit);
        orderQueryParams.setOffset(offset);

        // get order list
        List<Order> orderList = orderService.getOrders(orderQueryParams);

        // get order Item count
        Integer count = orderService.countOrder(orderQueryParams);

        // pagination
        Page<Order> page = new Page<>();
        page.setLimit(limit);
        page.setOffset(offset);
        page.setTotal(count);
        page.setResults(orderList);

        return ResponseEntity.status(HttpStatus.OK).body(page);
    }

    @ApiOperation("create order")
    @ApiResponses({@ApiResponse(code=201,message = "create order successfully")})
    @PostMapping("/users/{userId}/orders")
    public ResponseEntity<?> createOrder(@PathVariable Integer userId,
                                         @RequestBody @Valid CreateOrderRequest createOrderRequest) {

        Integer orderId = orderService.createOrder(userId, createOrderRequest);

        Order order = orderService.getOrderById(orderId);

        return ResponseEntity.status(HttpStatus.CREATED).body(order);
    }
}
