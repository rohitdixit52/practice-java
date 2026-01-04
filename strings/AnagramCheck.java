package Strings;

import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.print("Enter first string: ");
        String s1 = sc.nextLine().toLowerCase();

         System.out.print("Enter Second string: ");
        String s2 = sc.nextLine().toLowerCase();

        //Check length of the strings
        if(s1.length() != s2.length()){
            System.out.println("Not An Anagram");
            
        }
        int[] freq = new int[26];

        // count characters of first string
           for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }

        // Subtract character of second string 
         for (int i = 0; i < s2.length(); i++) {
            freq[s2.charAt(i) - 'a']--;
        }
     
        // checj k frequency array
             for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                System.out.println("Not an Anagram");
                sc.close();
                return;
            }
        }

        System.out.println("Strings are Anagram");
        sc.close();
    }
}
