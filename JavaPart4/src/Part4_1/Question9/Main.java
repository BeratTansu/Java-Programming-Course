package Part4_1.Question9;

public class Main {
    public static void main(String[] args) {
        //Create a class Debt with instance variables balance and interestRate.
        //These should be set via constructor public Debt(double initialBalance, double initialInterestRate).
        //Add method printBalance() that prints the current balance.
        //Add method waitOneYear() that increases the balance by multiplying it with the interest rate.
        //Example usage and output are shown below.

        Debt mortgage = new Debt(120000.0, 1.01);
        mortgage.printBalance();

        mortgage.waitOneYear();
        mortgage.printBalance();

        int years = 0;

        while (years < 20) {
            mortgage.waitOneYear();
            years = years + 1;
        }

        mortgage.printBalance();
    }
}
