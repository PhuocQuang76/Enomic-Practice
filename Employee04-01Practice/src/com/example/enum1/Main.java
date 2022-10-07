package com.example.enum1;

import com.example.enum1.example.PowerStatus;

public class Main {
    public static void main(String[] args){
        Computer c = new Computer();
        c.setStatus(PowerStatus.OFF);
        System.out.println(c.getStatus());
        System.out.println(c.getStatus().getDesc());

        c.setStatus(PowerStatus.ON);
        System.out.println(c.getStatus().name()); // default
        System.out.println(c.getStatus().getDesc());

        c.setStatus(PowerStatus.SLEEP);
        System.out.println(c.getStatus());
        System.out.println(c.getStatus().getDesc());

    }
}


