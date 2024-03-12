import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bank {

  private final List<Account> accounts = new ArrayList<>();

  public List<Account> getAccounts() {
    return new ArrayList<>(accounts);
  }

  public void addAccount(Account account) {
    accounts.add(account);
  }

  public void addAccounts(Account... accounts) {
    this.accounts.addAll(Arrays.asList(accounts));
  }
}
