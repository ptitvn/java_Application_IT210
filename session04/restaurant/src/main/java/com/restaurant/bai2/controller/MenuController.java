package com.restaurant.bai2.controller;


import com.restaurant.bai2.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bai2/menu")
public class MenuController {

    private final MenuService menuService;

    @Autowired
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    // Khi người dùng quên truyền ?category=..., sẽ mặc định là "chay"
    @GetMapping
    public String getMenu(@RequestParam(value = "category", required = false, defaultValue = "chay") String category) {
        return menuService.getMenuByCategory(category);
    }
}
