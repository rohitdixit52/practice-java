
class BankAccount{
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

     public String getAccountNumber(){
        return accountNumber;
     }
    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Deposited" + amount);
    }
    public void withdraw(double amount){ 
        if(balance >=  amount){
            balance = balance-amount;
            System.out.println("Withdrawn" + amount);
        }else{
            System.out.println("Insufficient Balance");
        }
    }
    public double getBalance(){
        return balance;
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        
        BankAccount acc = new BankAccount("1ABC", 5000);
        System.out.println("Account number is : " + acc.getAccountNumber());
        acc.deposit(10000);
        acc.withdraw(1000);
        System.out.println("Balance " + acc.getBalance());
    }
}
