package Part1_5.Question4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ask the user for an integer. If it’s greater than 0, print "The number is positive.",
        //otherwise print "The number is not positive."

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());

        if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }
    }
}
