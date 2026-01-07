package basics;
import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;
        int product = 1;

        while (num > 0) {
            int digit = num % 10;   // last digit
            sum += digit;           // add digit to sum
            product *= digit;       // multiply digit to product
            num = num / 10;         // remove last digit
        }

        if (sum == product) {
            System.out.println(original + " is a Spy Number");
        } else {
            System.out.println(original + " is NOT a Spy Number");
        }

        sc.close();
    }
}
