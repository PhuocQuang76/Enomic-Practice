package com.example.model;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer implements InitializingBean {
    private int id;
    private String name;
    private String email;
    private Address billingAddress;
    private Address shippingAddress;

    public Customer() {}

    public Customer(int id, String name, String email, Address billingAddress, Address shippingAddress) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.billingAddress = billingAddress;
        this.shippingAddress = shippingAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    @Autowired
    @Qualifier("add1")
    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    @Autowired
    @Qualifier("add2")
    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }


    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", billingAddress=" + billingAddress +
                ", shippingAddress=" + shippingAddress +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Hello");

    }
}
