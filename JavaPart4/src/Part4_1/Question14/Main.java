package Part4_1.Question14;

public class Main {
    public static void main(String[] args) {
        //Create a class named Multiplier that:
        //  Has a constructor public Multiplier(int number) which sets a multiplier number.
        //  Has a method public int multiply(int number) that multiplies the given number by the number stored in the constructor and returns the result.

        Multiplier multiplyByThree = new Multiplier(3);

        System.out.println("multiplyByThree.multiply(2): " + multiplyByThree.multiply(2));

        Multiplier multiplyByFour = new Multiplier(4);

        System.out.println("multiplyByFour.multiply(2): " + multiplyByFour.multiply(2));
        System.out.println("multiplyByThree.multiply(1): " + multiplyByThree.multiply(1));
        System.out.println("multiplyByFour.multiply(1): " + multiplyByFour.multiply(1));
    }
}
