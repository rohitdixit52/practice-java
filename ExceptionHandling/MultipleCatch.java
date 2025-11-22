package ExceptionHandling;
public class MultipleCatch {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred!");
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception occurred!");
        } catch (Exception e) {
            System.out.println("General Exception occurred!");
        }
        System.out.println("Program finished successfully!");
    }
}
