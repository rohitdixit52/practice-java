package basics;
public class EvenOdd {
    public static void main(String[] args) {
        int arr[] = {4,5,2,6,7,4,3};
        int even = 0;
        int odd = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("No of odd elements in given array is : " + odd + "   " + "No of even elements in given array is :" + even);
    }
}
