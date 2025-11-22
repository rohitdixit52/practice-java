package Strings;

import java.util.HashMap;


public class FrequencyCount {
    public static void main(String[] args) {
        String str = "banana";
 
      HashMap<Character, Integer> map = new HashMap<>();

     for (char c  : str.toCharArray()) {
        map.put(c,map.getOrDefault(c, 0) + 1);

     }

     System.out.println("frequency of elements in given string is :" + map);

    }
}
