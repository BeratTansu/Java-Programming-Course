package Part4_1.Question13;

public class Main {
    public static void main(String[] args) {
        //The class Agent has firstName and lastName attributes.
        //Previously, a print() method printed the agent's name like:
        //  My name is Bond, James Bond
        //Now, remove the print() method and instead override the toString() method,
        //so that when the agent object is printed with System.out.println(agent), it produces the same output.

        Agent bond = new Agent("James", "Bond");

        bond.toString(); // prints nothing
        System.out.println(bond);

        Agent ionic = new Agent("Ionic", "Bond");
        System.out.println(ionic);
    }
}
