package Part4_1.Question16;

import com.sun.security.jgss.GSSUtil;

public class Main {
    public static void main(String[] args) {
        //Part 1 - Constructor and toString:
        //  Create a class called PaymentCard.
        //  The constructor takes the initial balance.
        //  toString should return “The card has a balance of X euros”.
        //Part 2 - eatAffordably and eatHeartily:
        //  Add eatAffordably() (subtracts €2.6) and eatHeartily() (subtracts €4.6).
        //Part 3 - No negative balance
        //  Update the above methods so that the balance can’t go negative.
        //  If there’s not enough money on the card, the balance should not change.
        //Part 4 - addMoney
        //  Create the method addMoney(double amount). It adds the given amount to the card,
        //  but the card’s balance must not exceed 150 euros.
        //Part 5 - Negative loading barrier
        //  If a negative value is passed to addMoney, the balance must not change.
        //Part 6 - Multiple cards and transactions
        //  Write a Main method that does the following:
        //      Create Paul’s card (20€)
        //      Create Matt’s card (30€)
        //      Paul: eatHeartily()
        //      Matt: eatAffordably()
        //      Print the cards
        //      Paul: addMoney(20)
        //      Matt: eatHeartily()
        //      Print the cards
        //      Paul: eatAffordably() twice
        //      Matt: addMoney(50)
        //      Print the cards

        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        paulsCard.eatHeartily();
        mattsCard.eatAffordably();

        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        paulsCard.addMoney(20);
        mattsCard.eatHeartily();

        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50);

        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);
    }
}
