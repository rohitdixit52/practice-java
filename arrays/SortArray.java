package arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {
    public static void main(String[] args) {
      Integer[] arr = {10, 4, 2, 15, 8};
        Arrays.sort(arr);
        System.out.println("Ascending Order : " + Arrays.toString(arr));


        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Descending  Order : " + Arrays.toString(arr));
    }
}
