package CollectionFramework;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> langs = new HashSet<>();

        langs.add("Java");
        langs.add("Python");
        langs.add("C++");
        langs.add("Java"); 

        System.out.println("All Languages: " + langs);
   
        System.out.println("Contains Python? " + langs.contains("Python"));

        langs.remove("C++");
        System.out.println("After removing C++: " + langs);

        System.out.println("\nIterating using for-each:");
        for (String l : langs)
            System.out.println(l);

    }
}
