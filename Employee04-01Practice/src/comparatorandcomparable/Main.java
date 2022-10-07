package comparatorandcomparable;

import comparatorandcomparable.misc.Boots;
import comparatorandcomparable.misc.CustomShirt;
import comparatorandcomparable.misc.Flats;
import comparatorandcomparable.misc.Shirt;
import comparatorandcomparable.products.Clothing;
import comparatorandcomparable.products.Footwear;
import comparatorandcomparable.products.Returnable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void returnPolicy(Returnable r) {
        r.doReturn();
    }

    public static void print(Clothing c) {
        System.out.println(c);
        if(c instanceof Shirt) {
            returnPolicy((Returnable)c);
        }
    }

    public static void print(Footwear f) {
        System.out.println(f);
        if(f instanceof Flats) {
            returnPolicy((Returnable)f);
        }
    }

    public static void main(String[] args) {

        Clothing[] cloths = {
                new Shirt(1, "Levis-TShirt", 5, 10, 40),
                new CustomShirt(4, "Custom Shirt-Cust1", 20, 2),
                new Shirt(2, "US-POLO-shirt", 8, 10, 38),
                new CustomShirt(5, "Custom Shirt-Cust2", 100, 1),
                new Shirt(3, "Adidas-Denim", 15, 10, 44)
        };
        List<Clothing> clothList = new ArrayList<>(Arrays.asList(cloths));
        //clothList.add(new Shirt(6, "Armani", 105, 2, 32));
        Function<Clothing, Double> f = (c) -> c.getPrice();
        clothList.forEach(c -> System.out.println(f.apply(c)));
        Footwear[] footwears = {
                new Flats(101, "C-1001", 10.21, 10),
                new Flats(102, "C-1002", 11.56, 5),
                new Boots(103, "B-1200", 23.50, 4, false),
                new Boots(104, "B-1201", 23.50, 4, true),
        };
        List<Footwear> footwearList = Arrays.asList(footwears);
    }
}
