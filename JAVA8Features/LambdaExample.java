package JAVA8Features;

interface Greeting {
    void sayHello(String name);
}

interface Sum{
    int add(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args) {
        Greeting g = (name) -> System.out.println("Hello, " + name + "!");
        g.sayHello("Rohit");

        Sum s = (a,b) -> a+b;
        System.out.println("Sum is : " + s.add(10, 10));
    }
}

