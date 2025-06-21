package Part2_1.Question1;

import java.util.Scanner;

public class SquareNumber {
    public static void main(String[] args) {
        //Write a program that reads an integer from the user and prints the square of that integer.

        Scanner scanner = new Scanner(System.in);

        int number = Integer.valueOf(scanner.nextLine());

        int square = number * number;

        System.out.println(square);
    }
}
