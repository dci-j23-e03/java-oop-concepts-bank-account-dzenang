public class SavingsAccount extends Account {
    private float interest;

    public SavingsAccount(int accountNumber, float interest) {
        super(accountNumber);
        this.interest = interest;
    }

    public void addInterest() {
        // 500
        // interest: 1.5 current balance: 500 * 1,5 = 7,5 (interest amount) new balance: 507,5
        this.deposit(Math.round(getBalance() * interest));
    }

    @Override
    protected void doUpdate() {
        addInterest();
    }
}
