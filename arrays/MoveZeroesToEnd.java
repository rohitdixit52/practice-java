package arrays;

import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int arr[] = {1,2,0,5,0,2};
        int idx = 0;

        for (int i : arr) {
            if(i!=0){
                arr[idx++] = i;


            }
        }
        while(idx < arr.length) {
            arr[idx++] = 0;

             System.out.println(Arrays.toString(arr));
        }
    }

}
