package Strings;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "aabbcddee";
        HashMap<Character, Integer> freq = new HashMap<>();
      
         for(char c : str.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0)+ 1);

         }

         for(char c : str.toCharArray()){
            if(freq.get(c) == 1){
                System.out.println("First Non Repeating character in the string is  " + c);
                break;
            }
         }
    }

}
