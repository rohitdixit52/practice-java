package basics;
import java.util.Scanner;
public class NaturalSum {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println("sum of first " + n + " natural number is :" + sum);
       sc.close();
    }
}
