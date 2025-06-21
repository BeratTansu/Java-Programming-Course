package Part1_3.Question3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Write a program that asks the user to give a floating-point number (double).
        //Print the number the user gave.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        double number = Double.parseDouble(scanner.nextLine());

        System.out.println("You gave the number " + number);
    }
}
