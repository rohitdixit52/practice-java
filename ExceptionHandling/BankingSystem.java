package ExceptionHandling;


class InsufficientFundsException extends Exception {
    InsufficientFundsException(String msg) 
    { super(msg); 
         }
}

class Account {
    private double balance;

    Account(double balance) { 
        this.balance = balance; 
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount);
    }

    void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance)
            throw new InsufficientFundsException("Not enough balance!");
        balance -= amount;
        System.out.println("Withdrew " + amount);
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Account acc = new Account(5000);
        acc.checkBalance();

        try {
            acc.withdraw(7000);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Transaction complete ");
        }
    }
}
