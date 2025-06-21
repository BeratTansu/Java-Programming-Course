package Part1_4.Question6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ask the user for two integers and print their average as a floating-point number.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());

        double average = (first + second) / 2.0;

        System.out.println("The average is " + average);
    }
}
