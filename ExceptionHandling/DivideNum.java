package ExceptionHandling;

public class DivideNum {
    public static void main(String[] args) {
        int n = 7;
        try {
            int div = n/0;
            System.out.println("Result is :" + div);
        } catch (ArithmeticException e) {
            System.out.println("Error" +" " + n + " is nor divided by 0");
        }
        System.out.println("Program continues");
    }
}
