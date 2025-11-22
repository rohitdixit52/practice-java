package CollectionFramework;

// File: TreeSetDemo.java
import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>();
        // elements stores in sorted manner 
        nums.add(25);
        nums.add(10);
        nums.add(5);
        nums.add(30);
        nums.add(15);

        System.out.println("Sorted Set: " + nums);
        // First element is smallest in the treeset     
        System.out.println("Smallest: " + nums.first());
        System.out.println("Largest: " + nums.last());
    }
}
