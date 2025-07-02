package Part4_1.Question12;

public class Main {
    public static void main(String[] args) {
        //Create a class called Gauge. This class should have:
        //  A private integer variable value (initially 0).
        //  A method public void increase() which increases value by 1 but does not let it exceed 5.
        //  A method public void decrease() which decreases value by 1 but does not allow it to go below 0.
        //  A method public int value() which returns the current value.
        //  A method public boolean full() which returns true if the value is 5, otherwise false.

        Gauge g = new Gauge();

        while (!g.full()) {
            System.out.println("Not full! Value: " + g.value());
            g.increase();
        }

        System.out.println("Full! Value: " + g.value());
        g.decrease();
        System.out.println("Not full! Value: " + g.value());
    }
}
