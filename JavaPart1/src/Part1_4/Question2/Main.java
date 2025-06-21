package Part1_4.Question2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ask the user for two numbers, then print their sum.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number= ");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number= ");
        int second = Integer.parseInt(scanner.nextLine());

        int sum = first + second;
        System.out.println("The sum of the numbers is " + sum);
    }
}
