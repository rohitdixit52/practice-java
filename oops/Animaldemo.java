package OOPS;
class Animal{
    void sound(){

    }
}
  
class Dog extends Animal{
    void sound(){
        System.out.println("The dog barks");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("The cat is meowing");
    }
}


public class Animaldemo {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();
        Cat c1 = new Cat();
        c1.sound();
    }
}
