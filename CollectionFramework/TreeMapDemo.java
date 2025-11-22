package CollectionFramework;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Blue");
        treeMap.put(30, "Green");
        treeMap.put(10, "Red");
        
        System.out.println("Tree Map is :" + "  " + treeMap);
    }
}
