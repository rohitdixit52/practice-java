package basics;

import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int square = num * num;  // Step 1: calculate square
        int sum = 0;

        // Step 2: sum of digits of square
        while (square > 0) {
            int digit = square % 10;   // extract digit
            sum += digit;              // add to sum
            square = square / 10;      // remove last digit
        }

        // Step 3: compare
        if (sum == num) {
            System.out.println(num + " is a Neon Number");
        } else {
            System.out.println(num + " is NOT a Neon Number");
        }

        sc.close();
    }
}
