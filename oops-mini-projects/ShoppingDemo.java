
import java.util.*;

class Product{
    String name;
    double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
}

class Cart{
    List<Product> products = new ArrayList<>();
    void addProduct(Product p){
       products.add(p);
       System.out.println(p.name + "\n Added to cart");
    }

    void removeProduct(String name){
        products.removeIf(p -> p.name.equalsIgnoreCase(name));
        System.out.println(name + " " + "Removed From Cart");
    }

    void showCart() {
        System.out.println("\nCart Items:");
        double total = 0;
        for (Product p : products) {
            System.out.println(p.name + " - " + p.price);
            total += p.price;
        }
        System.out.println("Total: " + total);
    }
}

public class ShoppingDemo {
    public static void main(String[] args) {

        Cart cart = new Cart();

        Product p1 = new Product("laptop", 100000);
        Product p2 = new Product("Mouse", 500);
        Product p3 = new Product("Keyboard", 1000);

         cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        cart.showCart();

        cart.removeProduct("mouse");
          cart.showCart();

    }
}
