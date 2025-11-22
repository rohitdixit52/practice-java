package arrays;

import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        int arr[] = {1,2,2,5,6,4,5,4};
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> dup = new HashSet<>();

       for(int n : arr){
        if(!set.add(n)){
            dup.add(n); 
          }
       }

        System.out.println("Duplicates are : " + dup);
    }
}
