package Part2_2.Question5;

import java.util.Scanner;

public class CountNegativeNumbers {
    public static void main(String[] args) {
        //Read numbers from the user until the user inputs 0.
        //Then print how many of the given numbers were negative.

        Scanner scanner = new Scanner(System.in);

        int negativeCount = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number < 0) {
                negativeCount++;
            }
        }

        System.out.println("Number of negative numbers: " + negativeCount);
    }
}
