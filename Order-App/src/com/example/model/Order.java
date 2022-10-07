package com.example.model;

import org.springframework.beans.factory.annotation.Autowired;
public class Order {
    private int orderId;
    private Item item;
    private int qty;
    private double totalPrice;
    private Customer customer;


    public Order() {}


    public Order(int orderId, Item item, int qty, double totalPrice, Customer customer) {
        this.orderId = orderId;
        this.item = item;
        this.qty = qty;
        this.totalPrice = totalPrice;
        this.customer = customer;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Item getItem() {
        return item;
    }

    @Autowired
    public void setItem(Item item) {
        this.item = item;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int qty, double price) {
        this.totalPrice = qty * price;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Autowired
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" + "\n"+
                "   - orderId=" + orderId + "\n"+
                "   - item=" + item +   "\n"+
                "   - qty=" + qty + "\n"+
                "   - totalPrice=$" + totalPrice +  "\n"+
                "   - customer=" + customer +"\n"+
                '}';
    }
}