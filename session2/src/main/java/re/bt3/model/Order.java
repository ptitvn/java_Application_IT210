package re.bt3.model;

import java.util.Date;

public class Order {
    private String orderId;
    private String productName;
    private int totalPrice;
    private Date orderDate;

    public Order(String orderId, String productName, int totalPrice, Date orderDate) {
        this.orderId = orderId;
        this.productName = productName;
        this.totalPrice = totalPrice;
        this.orderDate = orderDate;
    }

    public String getOrderId() { return orderId; }
    public String getProductName() { return productName; }
    public int getTotalPrice() { return totalPrice; }
    public Date getOrderDate() { return orderDate; }
}
