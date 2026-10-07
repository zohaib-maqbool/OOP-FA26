public class Account {
    private int balance;


    public Account(){
        this.balance = 0;
    }
    public Account(int balance){
        this.balance = balance;
    }

    public void depositAmount(int amount){
        balance += amount;
        System.out.println(amount+" rupees deposited successfully.");
    }

    public int getBalance(){
        return balance;
    }


    public void withdrawAmount(int amount){
        if (balance > 0 && balance > amount){
            System.out.println("Your amount "+amount+"PKR is withdrawn successfully.");
            balance = balance - amount;
            System.out.println("Your current balance is RS."+balance);
        }
        else{
            System.out.println("Sorry! can not withdraw. Your current balance is Rs."+balance);
        }

    }

}
