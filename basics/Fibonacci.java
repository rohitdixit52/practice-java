package basics;
public class Fibonacci {
    public static void main(String[] args) {
        int n = 7;
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1 + " " + n2 + " ");

        for(int i = 2; i <= n; i++){
            int c = n1+n2;
            System.out.print(c + " ");
            n1 = n2;
            n2 = c;
            

        }
    }
}
