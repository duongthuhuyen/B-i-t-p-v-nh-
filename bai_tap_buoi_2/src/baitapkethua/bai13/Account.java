package baitapkethua.bai13;

public class Account {
    private double balance;
    private String acct_id ;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean withdraw(double amount){
        if(amount <this.balance){
            return true;
        }
        return false;
    }

    public void deposit(){
        
    }
}
