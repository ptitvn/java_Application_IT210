package com.restaurant.bai2.service;

import org.springframework.stereotype.Repository;

@Repository
public class MenuRepository {

    public String getMenuByCategory(String category) {
        switch (category.toLowerCase()) {
            case "chay":
                return "Thực đơn món chay";
            case "man":
                return "Thực đơn món mặn";
            case "nuoc":
                return "Thực đơn đồ uống";
            default:
                return "Thực đơn không xác định";
        }
    }
}
