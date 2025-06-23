package Part3_1.Question12;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfList {
    public static void main(String[] args) {
        //The exercise template contains a base that reads numbers from the user and adds them to a list.
        //Reading is stopped once the user enters the number -1.
        //When reading ends, calculate and print the average of the numbers in the list.

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true){
            System.out.println("Enter a number: ");
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1){
                break;
            }

            numbers.add(input);
        }

        int sum = 0;
        for (int number : numbers){
            sum += number;
        }

        double avg = (double) sum / numbers.size();

        System.out.println("Average: " + avg);
    }
}
