package ExceptionHandling;

public class ArrayIdexExample {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
        
            System.out.println("Array index out of bounds");
        }
    }
    
}
