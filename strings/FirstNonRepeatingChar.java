package Strings;

import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = sc.nextLine().toLowerCase();

        int freq[] = new int[26];

        // count frequency of each character 
        for(int i = 0;  i<str.length(); i++){
                char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            }
        }

         boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z' && freq[ch - 'a'] == 1) {
                System.out.println("First non-repeating character: " + ch);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No non-repeating character found");
        }

        sc.close();

    }
    
}
