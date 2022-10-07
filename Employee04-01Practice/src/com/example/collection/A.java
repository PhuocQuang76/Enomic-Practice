package com.example.collection;

import java.util.Objects;

public class A {
    private int number;

    public A(int number){
        this.number = number;
    }

    public String toString(){
        return "" + number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof A)) return false;
        A a = (A) o;
        return number == a.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
