package com.example.exception.demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest {
    public static String readFileContent(String filename) throws IOException {
        FileReader fr=new FileReader(filename);
        BufferedReader br=new BufferedReader(fr);
        String s="";
        StringBuilder sb=new StringBuilder();

        while((s=br.readLine())!=null) {
            sb.append(s);
            sb.append("\n");
        }

        return sb.toString();

    }

    public static void main(String[] args) {

        try {
            String s=readFileContent("/Users/quanghongphuoc/Enomics/Employee04-01Practice/src/com/example/exception/demo/ReadMe.txt");
            System.out.println(s);
        } catch(IOException e) {
            // TODO Auto-generated catch block
            //e.printStackTrace();
            System.err.println(e);
        }
        System.out.println("end of main");
    }
}
