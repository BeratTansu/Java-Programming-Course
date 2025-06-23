package Part3_1.Question7;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintByIndexRange {
    public static void main(String[] args) {
        //The exercise template contains a base program that reads numbers from the user and stores them in a list. The reading stops when the user enters -1.
        //✅ Expand the program to:
        //  After reading, ask the user for two indices: a start and an end index.
        //  Print all numbers in the list from the start index to the end index (inclusive).
        //  You can assume the indices given are valid and within the list's bounds.

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true){
            System.out.println("Enter a number = ");
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1){
                break;
            }

            numbers.add(input);
        }

        System.out.println("From where? ");
        int index1 = Integer.valueOf(scanner.nextLine());
        System.out.println("To where? ");
        int index2 = Integer.valueOf(scanner.nextLine());

        for (int i = index1; i <= index2; i++) {
            System.out.println(numbers.get(i));
        }
    }
}
