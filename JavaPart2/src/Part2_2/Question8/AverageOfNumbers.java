package Part2_2.Question8;

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        //Ask the user for numbers until they input 0.
        //Then print the average of the numbers (excluding the 0).
        //You can assume the user gives at least one number.

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            sum += number;
            count++;
        }

        double average = (double) sum / count;

        System.out.println("Average of the numbers: " + average);
    }
}
