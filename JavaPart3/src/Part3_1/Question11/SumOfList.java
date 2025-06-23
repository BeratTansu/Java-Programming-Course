package Part3_1.Question11;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
    public static void main(String[] args) {
        //The exercise template contains a base that reads numbers from the user and adds them to a list.
        //Reading stops when the number -1 is entered.
        //Modify the program so that after reading the numbers it calculates and prints the sum of the numbers in the list.

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true){
            System.out.println("Enter a number: ");
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1){
                break;
            }

            numbers.add(input);
        }

        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }

        System.out.println("Sum: " + sum);
    }
}
