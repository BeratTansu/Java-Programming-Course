package Part1_4.Question4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ask the user for two integers.
        //Print the addition formula in the format: a + b = sum.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());

        int sum = first + second;

        System.out.println(first + " + " + second + " = " + sum);
    }
}
