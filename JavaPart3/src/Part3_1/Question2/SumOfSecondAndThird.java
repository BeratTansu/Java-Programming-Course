package Part3_1.Question2;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfSecondAndThird {
    public static void main(String[] args) {
        //The given program reads integers from the user and stores them in a list.
        //Input ends when the user enters 0.
        //The original version prints the first number from the list.
        //Modify the program so that it prints the sum of the second and third numbers (i.e., the values at index 1 and 2).

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true){
            System.out.println("Please give a number: ");
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0){
                break;
            }

            numbers.add(input);
        }

        int sum = numbers.get(1) + numbers.get(2);
        System.out.println("Sum = " + sum);
    }
}
