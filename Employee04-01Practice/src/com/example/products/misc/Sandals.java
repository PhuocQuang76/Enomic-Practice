package com.example.products.misc;

import com.example.products.Footwear;
import com.example.products.Returnable;

public class Sandals extends Footwear implements Returnable {
    private boolean bump;
    public Sandals(int id, String desc, double price, int size, boolean bump) {
        super(id, desc, price, size);
        this.bump = bump;
    }

    public boolean isBump() {
        return bump;
    }

    public void setBump(boolean bump) {
        this.bump = bump;
    }

    @Override
    public void print() {
        super.print();
        if(isBump()){
            System.out.println("This is bump sandal");
        }
    }

    @Override
    public void doReturn() {
        System.out.println("Return-Policy:30 days return policy");
    }
}
