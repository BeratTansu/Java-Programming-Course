package Part4_1.Question16;

public class PaymentCard {
    private double balance;

    public PaymentCard(int openingBalance){
        this.balance = openingBalance;
    }

    public void eatAffordably(){
        if (this.balance >= 2.60){
            this.balance-=2.60;
        }
    }

    public void eatHeartily(){
        if (this.balance >= 4.60){
            this.balance-=4.60;
        }
    }

    public void addMoney(double amount){
        if (amount > 0) {
            this.balance += amount;
            if (this.balance > 150.0) {
                this.balance = 150.0;
            }
        }
    }

    public String toString(){
        return "The card has a balance of " + this.balance + " euros";
    }
}
