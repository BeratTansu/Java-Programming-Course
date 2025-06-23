package Part3_1.Question10;

import java.util.ArrayList;
import java.util.Scanner;

public class SmallestNumberAndIndices {
    public static void main(String[] args) {
        //Write a program that reads numbers from the user and stores them in a list.
        //The reading stops when the number 9999 is entered.
        //After this, the program prints the smallest number in the list and the indices where this number is found.
        //Note: the smallest number may appear multiple times.

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true){
            System.out.println("Enter a number: ");
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 9999){
                break;
            }

            numbers.add(input);
        }

        int smallestNumber = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {
            if (smallestNumber > numbers.get(i)){
                smallestNumber = numbers.get(i);
            }
        }

        System.out.println("Smallest Number = " + smallestNumber);

        for (int i = 0; i < numbers.size(); i++) {
            if (smallestNumber == numbers.get(i)){
                System.out.println("Found at index: " + i);
            }
        }
    }
}
