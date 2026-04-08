package com.restaurant.bai3.service;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {

    public String getOrderById(Long id) {
        return "Chi tiết đơn hàng số " + id;
    }
}
