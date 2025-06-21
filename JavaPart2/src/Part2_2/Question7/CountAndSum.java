package Part2_2.Question7;

import java.util.Scanner;

public class CountAndSum {
    public static void main(String[] args) {
        //Ask the user for numbers until they input 0.
        //Then print how many numbers were inputted and their sum.
        //(You need two variables: one for count, one for sum.)

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            count++;
            sum += number;
        }

        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);
    }
}
