package collection.genrics;

import java.util.ArrayList;

public class CreateSet {
    public static void main(String[] args) {
        ArrayList<Object> fruit = new ArrayList<>();
        Apple a1 = new Apple("red", 2);
        Apple a2 = new Apple("green", 6);
        Orange orange = new Orange("orange");
        fruit.add(a1);
        fruit.add(a2);
        fruit.add(orange);
        for(Object obj : fruit) {
            String color = ((Apple) obj).color;
            System.out.println(color);
        }
        // output:
        // red
        //green
        //null          【？？】


    }
}
