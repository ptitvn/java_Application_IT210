package com.restaurant.bai3.service;

import com.restaurant.common.Dish;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminDishService {

    private List<Dish> dishes = new ArrayList<>();

    public AdminDishService() {
        dishes.add(new Dish(1, "Phở bò", 45000, true));
        dishes.add(new Dish(2, "Bún chả", 40000, true));
        dishes.add(new Dish(3, "Nem rán", 30000, false));
    }

    public List<Dish> getAllDishes() {
        return dishes;
    }

    public Dish findById(int id) {
        return dishes.stream()
                .filter(d -> d.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void updateDish(Dish updatedDish) {
        for (Dish d : dishes) {
            if (d.getId() == updatedDish.getId()) {
                d.setName(updatedDish.getName());
                d.setPrice(updatedDish.getPrice());
                d.setAvailable(updatedDish.isAvailable());
                break;
            }
        }
    }
}
