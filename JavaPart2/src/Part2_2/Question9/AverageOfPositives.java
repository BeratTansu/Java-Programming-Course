package Part2_2.Question9;

import java.util.Scanner;

public class AverageOfPositives {
    public static void main(String[] args) {
        //Ask the user for numbers until they enter 0.
        //After that, print the average of positive numbers (> 0).
        //If there are no positive numbers, print "Cannot calculate the average".

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number > 0) {
                sum += number;
                count++;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println(average);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
