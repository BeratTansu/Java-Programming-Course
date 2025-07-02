package Part4_1.Question8;

public class Main {
    public static void main(String[] args) {
        //This exercise consists of multiple parts. The class DecreasingCounter has:
        //a private int variable value that holds the counter value
        //a constructor that sets the initial value
        //a method printValue() that prints the current value
        //You are asked to implement:
        //  The decrement() method which decreases the counter value by one, but the value cannot go below zero. So, if the value is zero, decrementing does nothing.
        //  A method reset() that sets the counter value back to zero.
        //When running the main program examples given, the outputs must match the samples provided.

        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.decrement();
        counter.printValue();
    }
}
