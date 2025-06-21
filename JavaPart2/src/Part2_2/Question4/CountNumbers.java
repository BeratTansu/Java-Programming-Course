package Part2_2.Question4;

import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        //Read numbers from the user until the user inputs 0.
        //Then print how many numbers were given (excluding the 0).

        Scanner scanner = new Scanner(System.in);

        int count = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            count++;
        }

        System.out.println("Number of numbers: " + count);
    }
}
