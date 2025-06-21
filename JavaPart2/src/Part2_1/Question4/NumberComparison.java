package Part2_1.Question4;

import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        //Read two integers from the user.
        //If the first number is greater than the second, print "(first) is greater than (second)."
        //If the first number is smaller, print "(first) is smaller than (second)."
        //Otherwise, print "(first) is equal to (second)."
        //Replace (first) and (second) with the actual numbers.

        Scanner scanner = new Scanner(System.in);

        int first = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());

        if (first > second) {
            System.out.println(first + " is greater than " + second + ".");
        } else if (first < second) {
            System.out.println(first + " is smaller than " + second + ".");
        } else {
            System.out.println(first + " is equal to " + second + ".");
        }
    }
}
