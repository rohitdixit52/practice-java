package ExceptionHandling;
class InsufficentBalanceException extends Exception{
   InsufficentBalanceException(String message){
    super(message);
   }
}
class BankAccount{
    double balance = 50000;
void withdraw(double amount) throws InsufficentBalanceException{
   if(amount > balance){
    throw new InsufficentBalanceException("Insufficient Balance!");

    
   }else{
    balance = balance - amount;
    System.out.println("Withdrawal SuccessFull : " + " Remaining Balance is : " + balance);
   }
}

}
 
public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        try {
            acc.withdraw(100000);
        } catch (InsufficentBalanceException e) {
            System.out.println("Error : " + " " + e.getMessage());
           
        }
    }
}
