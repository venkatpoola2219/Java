package Java.Mouritech.venkat.Collection;

import java.util.ArrayList;

public class Iterate {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
