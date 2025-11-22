package basics;
public class MaxMinArray {
    public static void main(String[] args) {
        int arr[] = {1,4,52,6,8,20};
        int max = arr[0];
        int min = arr[0];

     for(int i = 1; i < arr.length; i++){
        if(arr[i] > max){
            max = arr[i];
        }
        if(arr[i] < min){
            min = arr[i];
        }
     }
     System.out.println("Max element in array is : " + max + " Min element in array is : " + min);
    }
}
