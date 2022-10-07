package comparatorandcomparable.misc;

import comparatorandcomparable.products.Footwear;
import comparatorandcomparable.products.Returnable;

public class Flats extends Footwear implements Returnable {

    public Flats(int id, String desc, double price, int size) {
        super(id, desc, price, size);

    }

    @Override
    public void doReturn() {
        System.out.println("Return-Policy:15 days return policy");

    }

}