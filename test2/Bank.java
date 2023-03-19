package test2;
public class Bank {
    private Account[] accounts;

    public Bank(Account[] accounts) {
        this.accounts = accounts;
    }

    public void deposit(int accountIndex, double amount) {
        Account account = accounts[accountIndex];
        account.deposit(amount);
    }

    public void withdraw(int accountIndex, double amount) {
        Account account = accounts[accountIndex];
        account.Withdraw(amount);
    }
}
