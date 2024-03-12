public class CurrentAccount extends Account {

    private float overdraftLimit;

    public CurrentAccount(int accNumber, float overdraftLimit) {
        super(accNumber);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);

        // balance: 500 limit: 100 withdraw: 1000 new balance: -500 < -100
        if (getBalance() < (overdraftLimit * -1)) {
            System.out.println("CurrentAccount.withdraw(...): cannot withdraw more than allowed limit.");
            deposit(amount);
        }
    }

    private boolean isInOverdraft() {
        return getBalance() < 0;
    }

    @Override
    protected void doUpdate() {
        if (isInOverdraft()) {
            System.out.printf("CurrentAccount.doUpdate(...): account %d is in overdraft.%n", getAccountNumber());
        }
    }

    public float getOverdraftLimit() {
        return overdraftLimit;
    }
}
