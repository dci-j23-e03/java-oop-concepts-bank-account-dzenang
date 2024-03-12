public class SavingsAccount extends Account {
    private float interest;

    public SavingsAccount(int accountNumber, float interest) {
        super(accountNumber);
        this.interest = interest;
    }

    // static polymorphism with addInterest methods
    public void addInterest() {
        // 500
        // interest: 1.5 current balance: 500 * 1,5 = 7,5 (interest amount) new balance: 507,5
        addInterest(Math.round(getBalance() * interest));
    }

    private void addInterest(double interestAmount) {
        this.deposit(interestAmount);
    }

    @Override
    protected void doUpdate() {
        addInterest();
    }

    public float getInterest() {
        return interest;
    }
}
