package CollectionFramework;

// File: AllCollectionsDemo.java
import java.util.*;

public class AllCollectiondemo {
    public static void main(String[] args) {
        // ---------- List ----------
        List<String> cities = new ArrayList<>(List.of("Delhi", "Mumbai", "Kolkata", "Delhi"));
        System.out.println("Cities (List): " + cities);

        // ---------- Set ----------
        Set<String> uniqueCities = new HashSet<>(cities);
        System.out.println("Unique Cities (Set): " + uniqueCities);

        // ---------- Map ----------
        Map<Integer, String> map = new HashMap<>();
        int id = 1;
        for (String c : uniqueCities)
            map.put(id++, c);

        System.out.println("City Map (ID → Name): " + map);

        // ---------- Sorting ----------
        List<String> sorted = new ArrayList<>(uniqueCities);
        Collections.sort(sorted);
        System.out.println("Sorted Cities: " + sorted);

        // ---------- Iterator ----------
        System.out.println("\nIterating Sorted Cities:");
        Iterator<String> it = sorted.iterator();
        while (it.hasNext())
            System.out.println("- " + it.next());
    }
}

