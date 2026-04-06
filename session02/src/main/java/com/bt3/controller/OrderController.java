package com.bt3.controller;

import com.bt3.model.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
public class OrderController {

    @GetMapping("/orders")
    public String listOrders(HttpSession session, ServletContext application, Model model) {
        // 1. Kiểm tra đăng nhập
        if (session.getAttribute("loggedUser") == null) {
            return "redirect:/login";
        }

        // 2. Tạo dữ liệu giả
        List<Order> orders = Arrays.asList(
                new Order("ORD001", "iPhone 15 Pro", 25000000, new Date()),
                new Order("ORD002", "MacBook M3", 35000000, new Date()),
                new Order("ORD003", "AirPods Pro", 5500000, new Date())
        );
        model.addAttribute("orderList", orders);

        // 3. Cập nhật bộ đếm toàn cục (Giải quyết Race Condition bằng synchronized)
        synchronized (application) {
            Integer count = (Integer) application.getAttribute("totalViewCount");
            if (count == null) count = 0;
            application.setAttribute("totalViewCount", count + 1);
        }

        return "orders";
    }
}