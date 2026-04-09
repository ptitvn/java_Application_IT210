package com.restaurant.bai2.service;

import com.restaurant.common.Dish;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DishService {

    public List<Dish> getAllDishes() {
        return Arrays.asList(
                new Dish(1, "Phở bò", 45000, true),
                new Dish(2, "Bún chả", 40000, true),
                new Dish(3, "Nem rán", 30000, false) // hết hàng
        );
    }
}
