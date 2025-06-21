package Part1_3.Question4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Write a program that:
        //Asks the user to "Write something:"
        //Then asks "True or false?"
        //Reads a boolean value from the user.
        //Prints the boolean value the user gave.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write something:");
        String something = scanner.nextLine();

        System.out.println("True or false?");
        boolean answer = Boolean.parseBoolean(scanner.nextLine());

        System.out.println(answer);
    }
}
