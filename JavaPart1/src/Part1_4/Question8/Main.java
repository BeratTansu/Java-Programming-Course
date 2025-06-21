package Part1_4.Question8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Write a program that asks the user for two numbers and
        //prints their sum, difference, product, and quotient.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());

        int sum = first + second;
        int diff = first - second;
        int product = first * second;
        double quotient = (double) first / second;

        System.out.println(first + " + " + second + " = " + sum);
        System.out.println(first + " - " + second + " = " + diff);
        System.out.println(first + " * " + second + " = " + product);
        System.out.println(first + " / " + second + " = " + quotient);
    }
}
