package Part3_1.Question14;

import java.util.ArrayList;

public class PrintNumbersInRange {
    public static void main(String[] args) {
        //Create the method public static void printNumbersInRange(...) that takes an ArrayList<Integer> and two integer bounds.
        //The method should print all numbers from the list that fall within the range [lowerLimit, upperLimit].

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);

        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(numbers, 0, 5);

        System.out.println("The numbers in the range [3, 10]");
        printNumbersInRange(numbers, 3, 10);
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int UpperLimit){
        for (int number : numbers){
            if (number >= lowerLimit && number <= UpperLimit){
                System.out.println(number);
            }
        }
    }
}
