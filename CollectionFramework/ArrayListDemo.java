package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        //Add elements
        names.add("Varsha");
        names.add("Deepak");
        names.add("Gauri");

        System.out.println("Original List : " + names);

        //Update
        names.set(1,"reena");

        //Remove 
        names.remove("Varsha");

        // Sort 
        Collections.sort(names);
        System.out.println("Sorted names " + names);

        // Search
        String name = "Gauri";
        if(names.contains(name)){
              System.out.println(name + " found at index: " + names.indexOf(name));

        }

        // loop on Arraylist
        System.out.println("\nAll names:");
        for (String n : names)
            System.out.println(n);
    }
}
