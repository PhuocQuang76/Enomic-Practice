package com.example;

import java.util.List;

public class Address {
    private int id;
    private String street;
    private String city;
    private List<String> phone;
    public String getStreet() {
        return street;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getPhone() {
        return phone;
    }
    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", phone=" + phone +
                '}';
    }
}
