package Part2_3.Question1;

import java.util.Scanner;

public class FromZeroToUserNumber {
    public static void main(String[] args) {
        //Write a program that reads a positive integer from the user and prints all numbers from 0 to that number (inclusive).

        Scanner scanner = new Scanner(System.in);

        int number = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i <= number; i++) {
            System.out.println(i);
        }
    }
}
