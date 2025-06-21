package Part1_4.Question3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ask the user for three numbers, then print their sum.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.valueOf(scanner.nextLine());

        int sum = first + second + third;

        System.out.println("The sum of the numbers is " + sum);
    }
}
