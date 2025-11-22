package CollectionFramework;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(10, "Banana");
        map.put(20, "Apple");

        System.out.println("LinkedHashMap is :" + map);
    }
}
