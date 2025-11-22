package JAVA8Features;
import java.util.function.*;


public class BuiltInInterfaces {
    public static void main(String[] args) {
        Predicate <Integer> isEven = n -> n % 2 == 0;
        Function <Integer, Integer> square = n -> n * n;
        Consumer<Integer> printer = n -> System.out.println("Value is : " + n);

        int num = 6;
        if(isEven.test(num)){
            printer.accept(square.apply(num));
        }
    }
}
