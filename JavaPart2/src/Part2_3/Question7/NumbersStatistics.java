package Part2_3.Question7;

import java.util.Scanner;

public class NumbersStatistics {
    public static void main(String[] args) {
        //Write a program that asks the user to input numbers continuously until the user inputs -1. When -1 is input, the program should print the following information:
        //A thank you message "Thx! Bye!"
        //The sum of all numbers inputted (excluding -1)
        //The count of how many numbers were inputted (excluding -1)
        //The average of the numbers (excluding -1)
        //How many of the numbers were even
        //How many of the numbers were odd
        //Make sure to print "Give numbers:" (without any space after the colon) before the input begins.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Give numbers:");

        int sum = 0;
        int count = 0;
        int evenCount = 0;
        int oddCount = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            sum += number;
            count++;

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average: " + average);
        } else {
            System.out.println("Average: 0");
        }

        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);
    }
}
