package Part3_1.Question9;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchIndexInList {
    public static void main(String[] args) {
        //The exercise template contains a base that reads numbers from the user and adds them to a list.
        //Reading is stopped once the user enters the number -1.
        //Expand the program so that it asks for a number,
        //and prints all indices where the number appears in the list.
        //If the number is not found, the program should print nothing.

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

        System.out.println("Search for? ");
        int searchNumber = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < numbers.size(); i++) {
            if (searchNumber == numbers.get(i)){
                System.out.println(numbers.get(i) + " is at index " + i);
            }
        }
    }
}
