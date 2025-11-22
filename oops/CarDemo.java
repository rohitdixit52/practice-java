package OOPS;

class car{
    String brand;
    String name;
    int price;

    public void displaydetails(){
        System.out.println("Brand = " + brand + "  "+ "Name = "+ " " + name + " "+ "Price =" +" "+ price);
    }
}

public class CarDemo {
    public static void main(String[] args) {
        car c1 = new car();
       
        c1.brand = "Honda";
        c1.name = "city";
        c1.price = 5000000;
         c1.displaydetails();

        car c2 = new car(); 

        c2.brand = "Hyundai";
        c2.name = "Baleno";
        c2.price = 5000000;
         c2.displaydetails();

    }
}
