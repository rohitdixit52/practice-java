package CollectionFramework;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Rohit");
        map.put(102, "Aman");
        map.put(103, "Neha");

        System.out.println("Original Map: " + map);

        // Get
        System.out.println("Name of Roll 102: " + map.get(102));

        // Update
        map.put(102, "Reena");

        // Remove
        map.remove(103);

        // Iterate
        System.out.println("\nIterating Map:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // Keys and Values
        System.out.println("\nKeys: " + map.keySet());
        System.out.println("Values: " + map.values());
    }
}

