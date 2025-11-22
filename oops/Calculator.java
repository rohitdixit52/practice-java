package OOPS;
class CalculatorDemo{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a + b + c;
    }
}

public class Calculator {
    public static void main(String[] args) {
        CalculatorDemo cal = new CalculatorDemo();
       System.out.println(cal.add(5, 10));
        System.out.println( cal.add(10, 10, 9));
    }
}
