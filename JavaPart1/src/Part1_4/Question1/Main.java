package Part1_4.Question1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ask the user for a number of days and then print the number of seconds in those days.
        //(Hint: 1 day = 86400 seconds)

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
        int days = Integer.parseInt(scanner.nextLine());

        int seconds = days * 86400;

        System.out.println(seconds);
    }
}
