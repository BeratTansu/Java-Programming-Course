package Part2_3.Question2;

import java.util.Scanner;

public class FromNumberToHundred {
    public static void main(String[] args) {
        //Write a program that reads an integer (less than 100)
        //from the user and prints all numbers from that number up to 100 (inclusive).

        Scanner scanner = new Scanner(System.in);

        int number = Integer.valueOf(scanner.nextLine());

        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
