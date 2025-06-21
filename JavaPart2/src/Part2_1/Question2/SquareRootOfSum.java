package Part2_1.Question2;

import java.util.Scanner;

public class SquareRootOfSum {
    public static void main(String[] args) {
        //Write a program that reads two integers from the user and prints the square root of their sum.
        //No need to handle negative sums.

        Scanner scanner = new Scanner(System.in);

        int first = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());

        int sum = first + second;

        double result = Math.sqrt(sum);

        System.out.println(result);
    }
}
