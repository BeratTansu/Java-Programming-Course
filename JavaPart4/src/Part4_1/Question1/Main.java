package Part4_1.Question1;

public class Main {
    public static void main(String[] args) {
        //The exercise template includes a class called Account.
        //It represents a bank account with a balance.
        //Write a program that:
        //  Creates an account with a balance of 100.0
        //  Deposits 20.0 into it
        //  Prints the final state of the account
        //  You must perform the operations in this exact order.

        Account artosAccount = new Account("Arto's account", 100.00);
        Account artosSwissAccount = new Account("Arto's account in Switzerland", 1000000.00);

        System.out.println("Initial state");
        System.out.println(artosAccount);
        System.out.println(artosSwissAccount);

        artosAccount.withdraw(20);
        System.out.println("The balance of Arto's account is now: " + artosAccount.balance());
        artosSwissAccount.deposit(200);
        System.out.println("The balance of Arto's other account is now: " + artosSwissAccount.balance());

        System.out.println("End state");
        System.out.println(artosAccount);
        System.out.println(artosSwissAccount);
    }
}
