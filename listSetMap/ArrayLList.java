package listSetMap;

import java.util.ArrayList;

public class ArrayLList<S> {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // Duplicates Allowed
        System.out.println("Fruits: "+fruits);

        //Remove element
        fruits.remove("Banana");

        System.out.println("Fruits: "+fruits);

        System.out.println("Fruits: "+fruits.get(0));
    }
}
