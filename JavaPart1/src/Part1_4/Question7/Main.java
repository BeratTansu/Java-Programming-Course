package Part1_4.Question7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ask the user for three integers and print their average as a double.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.valueOf(scanner.nextLine());

        double average = (first + second + third) / 3.0;

        System.out.println("The average is " + average);
    }
}
