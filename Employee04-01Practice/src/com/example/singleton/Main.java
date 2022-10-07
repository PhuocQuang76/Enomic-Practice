package com.example.singleton;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<PeerSingleton> list = new ArrayList<>(9);
        System.out.println(list.size());
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
