package Part1_4.Question5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ask the user for two integers, then print the multiplication formula like a * b = product.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());

        int product = first * second;

        System.out.println(first + " * " + second + " = " + product);
    }
}
