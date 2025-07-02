package Part4_1.Question2;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        this.balance -= amount;
    }

    public double balance(){
        return this.balance;
    }

    public String toString(){
        return this.name + ": " + this.balance + "euros";
    }
}
