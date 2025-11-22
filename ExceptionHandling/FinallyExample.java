package ExceptionHandling;

public class FinallyExample {
    public static void main(String[] args) {
        int n = 5;
        try{
            int res = n/0;
        }catch(ArithmeticException e){
           System.out.println("Exception catched");

        }finally{
            System.out.println("Finally block executed");
        }
    }
}
