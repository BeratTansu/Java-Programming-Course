package Part2_3.Question5;

import java.util.Scanner;

public class SumOfInterval {
    public static void main(String[] args) {
        //Ask the user for a first and last number.
        //Calculate and print the sum of all numbers in that closed interval (from first to last, inclusive).

        Scanner scanner = new Scanner(System.in);

        System.out.print("First number? ");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.print("Last number? ");
        int last = Integer.valueOf(scanner.nextLine());

        int sum = 0;

        for (int i = first; i <= last; i++) {
            sum += i;
        }

        System.out.println("The sum is " + sum);
    }
}
