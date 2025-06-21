package Part2_2.Question6;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        //Write a program that keeps reading integers from the user until 0 is given.
        //Then print the sum of the given numbers.

        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            sum += number;
        }

        System.out.println("Sum of the numbers: " + sum);
    }
}
