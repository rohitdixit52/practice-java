package arrays;

public class MinMax {
    public static void main(String[] args) {
        int arr[] = {1,2,4,6,89,4};
        int max = arr[0], min = arr[0];

        // foreach loop 
        for (int n : arr) {
            if(n>max) max=n;
            if(n<min) min=n;

        }

        System.out.println("Max : " + max);
        System.out.println("Min is : " + min);
    }
}
