public class Account {
    public int balance;
    public boolean active;

    public Account(){

    }

    public Account(int balance, boolean active){
        this.balance=balance;
        this.active=active;
    }

    public int withdraw(int amount){
        balance = balance-amount;
        System.out.println("Withdrawal successful");
        return balance;
    }

    public int deposit(int amount){
        balance = balance+amount;
        System.out.println("Deposit successful");
        return balance;
    }
}
