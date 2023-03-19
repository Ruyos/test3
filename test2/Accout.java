package test2;

class Account {
    private String Name;
    private String Id;
    private double Balance;

    public Account(String Name,String Id,double Balance){
        this.Balance= Balance;
        this.Id=Id;
        this.Name=Name;
    }

    public void OpenAccount(){
        //开户
    }
    public double QueryBalance(){
        return Balance;//查询余额
    }
    public void deposit(double amount){
        Balance+=amount;//存款
    }
    public void Withdraw(double amount){
        if (amount > Balance) {
            System.out.println("余额不足！");
            return;
        }
        Balance -= amount;
    }

}