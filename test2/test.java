package test2;

public class test {
    public  static void main(String[] args){
        Account account1 = new Account("张三", "个人信息", 1000);
        Account account2 = new Account("李四", "个人信息", 2000);
        Account[] accounts = new Account[]{account1, account2};
        Bank bank = new Bank(accounts);

        bank.deposit(0, 500);
        System.out.println(account1.QueryBalance()); // 输出1500.0

        bank.withdraw(1, 1000);
        System.out.println(account2.QueryBalance()); // 输出1000.0
    }
}
