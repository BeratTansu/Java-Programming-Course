package Part2_3.Question4;

import java.util.Scanner;

public class SumFromOneToN {
    public static void main(String[] args) {
        //Ask the user for a number n, and calculate the sum 1 + 2 + 3 + ... + n.
        //Then print the result.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Last number? ");
        int n = Integer.valueOf(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum is " + sum);
    }
}
