package Part2_4.Question2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Expand the previous program so that the main method asks the user how many times the phrase will be printed.
        //Use a while loop to call the printText method the given number of times.

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many times?");
        int times = Integer.valueOf(scanner.nextLine());

        int count = 0;
        while (count < times) {
            printText();
            count++;
        }
    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
