package ExceptionHandling;

public class ParseString {
    public static void main(String[] args) {
        String num = "abc";
        try {
            int a = Integer.parseInt(num);
            System.out.println("Value is : "+ " " + a);

        } catch (NumberFormatException e) {
            System.out.println("ERROR : Invalid number format");
        }
    }
}
