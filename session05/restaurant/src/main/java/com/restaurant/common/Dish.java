package com.restaurant.common;

public class Dish {
    private int id;
    private String name;
    private double price;
    private boolean available;

    // Constructor mặc định (bắt buộc cho Spring)
    public Dish() {
    }

    // Constructor đầy đủ tham số
    public Dish(int id, String name, double price, boolean available) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.available = available;
    }

    // Getter & Setter
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }
}
