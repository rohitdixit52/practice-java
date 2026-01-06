package basics;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        while(num > 0){
            int digit = num % 10;
            sum += factorial(digit);
            num = num / 10;

        }

        if(sum == original){
            System.out.println(original + "   "+ " is a strong Number" );
        }else{
            System.out.println(original + "  " + "is a not a strong number");
        }
        sc.close();

    }
           static int factorial(int n){
        int fact = 1;
            for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
