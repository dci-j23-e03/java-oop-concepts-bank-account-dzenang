public class AccountOperations {

    public static void main(String[] args) {
        Account account1 = new Account(123456);
        Account account2 = new Account(789012);

        Account account3 = new SavingsAccount(565656, 0.2f);
        Account account4 = new SavingsAccount(787878, 0.06f);

        Account account5 = new CurrentAccount(111222, 100);
        Account account6 = new CurrentAccount(333444, 250);

        Bank bank = new Bank();
        bank.addAccounts(account1, account2, account3, account4, account5, account6);

        depositInto(200, account1);
        checkBalanceFrom(account1, 200);
        withdrawFrom(300, account1);
        checkBalanceFrom(account1, -100);

        System.out.println("===================");

        depositInto(50, account5);
        checkBalanceFrom(account5, 50);
        withdrawFrom(200, account5);
        checkBalanceFrom(account5, 50);
        withdrawFrom(80, account5);
        checkBalanceFrom(account5, -30);

        System.out.println("===================");

        depositInto(200, account2);
        depositInto(300, account3);
        depositInto(400, account4);
        depositInto(600, account6);

        System.out.println("===================");

        System.out.println("Updating accounts from the bank");
        bank.update();

        checkBalanceFrom(account1, -100);
        checkBalanceFrom(account2, 200);
        checkBalanceFrom(account3, 360);
        checkBalanceFrom(account4, 424);
        checkBalanceFrom(account5, -30);
        checkBalanceFrom(account6, 600);
    }

    public static void depositInto(double amount, Account account) {
        System.out.println(
                "Depositing "
                + Colors.ANSI_PURPLE
                + "$"
                + amount
                + Colors.ANSI_RESET
                + " into account "
                + Colors.ANSI_YELLOW
                + account.getAccountNumber()
                + Colors.ANSI_RESET
                + "...");
        account.deposit(amount);
    }

    public static void withdrawFrom(double amount, Account account) {
        System.out.println(
                "Withdrawing "
                + Colors.ANSI_PURPLE
                + "$"
                + amount
                + Colors.ANSI_RESET
                + " from account "
                + Colors.ANSI_YELLOW
                + account.getAccountNumber()
                + Colors.ANSI_RESET
                + "...");
        account.withdraw(amount);
    }

    public static void checkBalanceFrom(Account account, double shouldBe) {
        System.out.println(
                "["
                + account
                + "] :: Balance should be "
                + Colors.ANSI_PURPLE
                + "$"
                + shouldBe
                + Colors.ANSI_RESET
                + ".");
    }
}
