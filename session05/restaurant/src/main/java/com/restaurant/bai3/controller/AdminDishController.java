package com.restaurant.bai3.controller;

import com.restaurant.bai3.service.AdminDishService;
import com.restaurant.common.Dish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AdminDishController {

    @Autowired
    private AdminDishService adminDishService;

    @GetMapping("/bai3/edit/{id}")
    public String editDish(@PathVariable("id") int id, Model model) {
        Dish dish = adminDishService.findById(id);
        if (dish == null) {
            model.addAttribute("errorMessage", "Không tìm thấy món ăn yêu cầu!");
            // cần load lại danh sách để hiển thị
            List<Dish> dishes = adminDishService.getAllDishes();
            model.addAttribute("dishes", dishes);
            return "dish-list";
        }
        model.addAttribute("dish", dish);
        return "edit-dish";
    }

    @PostMapping("/bai3/update")
    public String updateDish(@ModelAttribute("dish") Dish dish, Model model) {
        // Giả lập cập nhật dữ liệu (ở thực tế sẽ gọi service để lưu vào DB)
        adminDishService.updateDish(dish);

        // Sau khi cập nhật, load lại danh sách
        List<Dish> dishes = adminDishService.getAllDishes();
        model.addAttribute("dishes", dishes);
        model.addAttribute("successMessage", "Cập nhật món ăn thành công!");

        return "dish-list";
    }
}
