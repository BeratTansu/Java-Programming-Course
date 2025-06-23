package Part3_1.Question15;

import java.util.ArrayList;

public class SumCalculator {
    public static void main(String[] args) {
        //Create a method public static int sum(ArrayList<Integer> numbers)
        //This method should return the sum of all integers in the list passed as a parameter.

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        System.out.println(sum(numbers)); // Output: 10

        numbers.add(5);
        numbers.add(1);
        System.out.println(sum(numbers));
    }

    public static int sum(ArrayList<Integer> numbers){
        int sum = 0;
        for (int number : numbers){
            sum += number;
        }
        return sum;
    }
}
