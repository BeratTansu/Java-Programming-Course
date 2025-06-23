package Part3_1.Question6;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintAllExceptStop {
    public static void main(String[] args) {
        //The exercise template contains a program that reads integers from the user and adds them to a list.
        //Reading stops when the user enters the number -1.
        //✅ Modify the program so that after reading, it prints all the numbers in the list, excluding -1.

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true){
            System.out.println("Give a number: ");
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1){
                break;
            }

            numbers.add(input);
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        //for(int number : numbers){    that's also true
        //  System.out.println(number);
        // }
    }
}
