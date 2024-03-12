import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bank {

    private final List<Account> accounts = new ArrayList<>();

    public List<Account> getAccounts() {
        // this is a technique which is used with collections, you should return a copy and not the actual collection
        return new ArrayList<>(accounts);
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void addAccounts(Account... accounts) {
        this.accounts.addAll(Arrays.asList(accounts));
    }

    public void update() {
        // account1, account2, savingsAccount1, savingsAccount2, currentAccount1, currentAccount2
        for (Account account : accounts) {
            // dynamic polymorphism, in runtime it is decided should we call doUpdate from Account, SavingsAccount or CurrentAccount class
            account.doUpdate();
        }
    }
}
