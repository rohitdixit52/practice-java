abstract class Payment{

    abstract void pay(double amount);

}

class CreditCardPayment extends Payment{
    void pay(double amount){
         System.out.println("Paid ₹" + amount + " via Credit Card 💳");
    }

}
   
class UpiPayment extends Payment{
    void pay(double amount){
         System.out.println("Paid ₹" + amount + " via UPI 💳");
    }
}
 
class NetBanking extends Payment{
    void pay(double amount){
         System.out.println("Paid ₹" + amount + " NetBanking 💳");
    }
}
public class PaymentDemo {
    public static void main(String[] args) {

          Payment[] payments = {
            new CreditCardPayment(),
            new UpiPayment(),
            new NetBanking()
        };

        for (Payment p : payments) {
            p.pay(1000);
        }
        
    }
}
