package Part3_2.Question2;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        //The exercise template already has an array containing numbers.
        //Complete the program so that it asks the user for a number to search in the array.
        //If the array contains the given number, the program tells the index containing the number.
        //If the array doesn't contain the given number, the program will advise that the number wasn't found.

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 4, 6, 2, 3, 9, 11, 7, 0};

        System.out.println("Search for?");
        int searchNumber = Integer.valueOf(scanner.nextLine());
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchNumber){
                System.out.println(searchNumber + " is at index " + i + ".");
                found = true;
                break;
            }
        }

        if (!found){
            System.out.println(searchNumber + " was not found.");
        }
    }
}
