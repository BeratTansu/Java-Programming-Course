package Part2_2.Question3;

import java.util.Scanner;

public class SquareOrReject {
    public static void main(String[] args) {
        //Write a program that asks the user for numbers repeatedly.
        //If the number is negative, print "Unsuitable number" and ask again.
        //If the number is zero, exit the loop.
        //If positive, print the square of the number.

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number < 0) {
                System.out.println("Unsuitable number");
            } else if (number == 0) {
                break;
            } else {
                System.out.println(number * number);
            }
        }
    }
}
