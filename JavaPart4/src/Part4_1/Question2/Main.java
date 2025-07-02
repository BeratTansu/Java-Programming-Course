package Part4_1.Question2;

public class Main {
    public static void main(String[] args) {
        //The Account class from the previous exercise is also used here.
        //Write a program that:
        //  Creates an account named "Matthews account" with balance 1000
        //  Creates an account named "My account" with balance 0
        //  Withdraws 100.0 from Matthew's account
        //  Deposits 100.0 into "My account"
        //  Prints both accounts

        Account matthewsAccount = new Account("Matthews Account", 1000);
        Account myAccount = new Account("My Account", 0);

        matthewsAccount.withdraw(100);

        myAccount.deposit(100);

        System.out.println(matthewsAccount);
        System.out.println(myAccount);
    }
}
