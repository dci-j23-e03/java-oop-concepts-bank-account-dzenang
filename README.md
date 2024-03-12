# Bank Account

In this exercise we'll simulate a bank account.

### The Bank // Account classes

Look at the **Account** class _Account.java_. It contains basic account operations such
as `deposit(double amount)` and `withdraw(double amount)`, as well as state values such as
`accNumber` and `balance`.

1. Using the **Account** class as a base class, write two derived classes called
   **_SavingsAccount_** and **_CurrentAccount_**.


2. A **SavingsAccount** object, in addition to the attributes of an **Account**
   object, should have a `float interest` field (you should receive it in the constructor) and a
   method which **adds interest** to the account.


3. The `addInterest` method should simply set the current `balance` to be `balance * interest`.


4. A **CurrentAccount** object, in addition to the attributes of an **Account** object, should have
   an `float overdraftLimit` variable (you should receive it in the constructor).


5. For the **CurrentAccount** class, you should override the `withdraw(double amount)` method from
   the **Account** class and take the `overdraftLimit` into consideration. It means the `balance`
   cannot go more negative than the `overdraftLimit` (i.e. if the overdraftLimit = 100, balance
   cannot be -101 or less).


6. Ensure that you have overridden methods of the **Account** class as necessary in both derived
   classes.


7. Now take a look at the **_Bank_** class. It contains an array of **Account** objects. Accounts in
   the array could be instances of the **Account** class, the **SavingsAccount**
   class, or the **CurrentAccount** class.


8. Write an `update` method in the Bank class. It iterates through each account, calling the
   `doUpdate` method of each account. The `doUpdate` method _should be overridden in each of
   Account's subclass_ and should do the following:
    - **SavingsAccount** get interest added (via the method you already wrote);
    - **CurrentAccount** get a letter sent if they are in overdraft (it can simply be a console
      output).

### The AccountOperations class

This is where our `main` method resides. **DO NOT CHANGE IT!**. Just run the main method to check
for the results.

## Hints:

- Note that the balance of an account may only be modified through the` deposit(double amount)` and
  `withdraw(double amount)` methods.
- The Account class should not need to be modified at all.
- Be sure to test what you have done after each step.
- In the `addInterest()` from   **SavingsAccount**, you might face poor precision while rounding the
  value. You can use `Math.round(interestResult)` to fix it.