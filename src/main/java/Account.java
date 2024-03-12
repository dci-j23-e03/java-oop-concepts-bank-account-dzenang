public class Account {
    private final int accNumber; // The account number
    private double balance; // The current balance

    public Account(int accNumber) {
        balance = 0.0;
        this.accNumber = accNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.err.println("Account.deposit(...): cannot deposit negative amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            balance -= amount;
        } else {
            System.err.println("Account.withdraw(...): cannot withdraw negative amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accNumber;
    }

    protected void doUpdate() {
        // nothing here
    }

    public String toString() {
        return Colors.ANSI_BLUE
               + "Account Number: "
               + Colors.ANSI_YELLOW
               + accNumber
               + Colors.ANSI_RESET
               + ", "
               + Colors.ANSI_BLUE
               + "Balance"
               + Colors.ANSI_RESET
               + " = "
               + (balance > 0 ? Colors.ANSI_GREEN : Colors.ANSI_RED)
               + "$"
               + balance
               + Colors.ANSI_RESET;
    }
}
