package Part3_1.Question1;

import java.util.ArrayList;
import java.util.Scanner;

public class ThirdInput {
    public static void main(String[] args) {
        //Create a program that asks the user to enter strings, which are added to a list.
        // The reading stops when the user enters an empty string.
        //Once the reading ends, the program should print the third string that was added to the list (i.e., the string at index 2).

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        while (true){
            System.out.println("Please input a string: ");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            inputs.add(input);
        }

        System.out.println(inputs.get(2)); // prints the third item (index 2)
    }
}
