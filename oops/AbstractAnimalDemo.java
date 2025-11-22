package OOPS;
abstract class Animal{
   abstract void sound();
    void sleep(){
        System.out.println("Sleeping.....");
    }

}
    class dog extends Animal{
        public void sound(){
          System.out.println("Dog Barks");
        }
    }
     
     class Cow extends Animal{
        public void sound(){
            System.out.println("Cow moos");
        }
     }

public class AbstractAnimalDemo {
    public static void main(String[] args) {
        dog d1 = new dog();
        Cow c1 = new Cow();

        d1.sound();
        d1.sleep();
        c1.sound();
        c1.sleep();
    }
}
