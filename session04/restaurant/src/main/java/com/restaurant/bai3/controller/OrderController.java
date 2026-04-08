package com.restaurant.bai3.controller;

import com.restaurant.bai3.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bai3/orders")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    // Lấy chi tiết đơn hàng theo ID (Cách A: PathVariable)
    @GetMapping("/{id}")
    public String getOrderDetail(@PathVariable Long id) {
        return orderService.getOrderById(id);
    }
}
