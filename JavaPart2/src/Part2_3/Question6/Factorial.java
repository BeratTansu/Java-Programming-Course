package Part2_3.Question6;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //Ask the user for a number. Then calculate and print the factorial of that number.
        //Factorial of 0 is also 1.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());

        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial: " + factorial);
    }
}
