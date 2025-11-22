 package OOPS;
 interface Vehicle {

    void start();
    void stop();
    
}

 class Bike implements Vehicle{
    public void start(){
        System.out.println("Bike starts");
    }
   public  void stop(){
        System.out.println("The Bike stops");
    }
 }

 class Car implements Vehicle{
   public  void start(){
        System.out.println("The car starts");
    }
    public void stop(){
        System.out.println("The Car stops");
    }
 }
public class VehicleDemo {
    public static void main(String[] args) {
        Bike b1 = new Bike();
        b1.start();
        b1.stop();

        Car c1 = new Car();
        c1.start();
        c1.stop();
    }
}
