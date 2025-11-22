package OOPS;
class Shape{
    double area(){
        return 0;
    }
}

   class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    @Override
    double area() {
    return Math.PI * radius * radius;
    }
   }

   class Rectangle extends Shape{
    double length, breadth;
    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    double area(){
        return length * breadth;
    }
   }

   class Triangle {
    double base, height;
    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    double area(){
        return (0.5 * base * height);
    }
   
    
   }
public class Shapedemo {
    public static void main(String[] args) {
        Circle c = new Circle(12);
        Rectangle r = new Rectangle(10, 10);
        Triangle t = new Triangle(10, 5);

        System.out.println("Area of circle is : " + c.area());
        System.out.println(" area of Rectangle is : " + r.area());
        System.out.println("Area of Triangle is : " + t.area());
    }
}
