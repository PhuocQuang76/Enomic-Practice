package com.example;

import java.util.ArrayList;
import java.util.Locale;

import static com.example.PeerSingleton.getInstance;

public class Main {
    public static void main(String[] args) {
        //PeerSingleton practice
        PeerSingleton peerList01 = PeerSingleton.getInstance();
        PeerSingleton peerList02 = PeerSingleton.getInstance();

        for (String ins : peerList01.getHostNames()) {
            System.out.println(ins);
        }


        System.out.println("**************************");

        for (String ins : peerList02.getHostNames()) {
            System.out.println(ins);
        }
    }

}
