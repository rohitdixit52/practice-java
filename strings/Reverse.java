package Strings;

public class Reverse {
    public static void main(String[] args) {
        String str = "Rohit";
        String rev = new StringBuilder(str).reverse().toString();

        System.out.println("Reversed string is : " + rev);
    }
}
