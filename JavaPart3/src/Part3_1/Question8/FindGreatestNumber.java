package Part3_1.Question8;

import java.util.ArrayList;
import java.util.Scanner;

public class FindGreatestNumber {
    public static void main(String[] args) {
        //The exercise template reads numbers from the user and adds them to a list.
        //Input ends when the user enters -1.
        //✅ Extend the program to:
        //  Find and print the greatest number in the list after input ends.
        //  You can assume at least one number is added before -1.

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

        int greatestNumber = numbers.get(0);
        for (int i = 1; i < numbers.size() ; i++) {
            if (greatestNumber < numbers.get(i)){
                greatestNumber = numbers.get(i);
            }
        }

        System.out.println("The greatest number = " + greatestNumber);
    }
}
