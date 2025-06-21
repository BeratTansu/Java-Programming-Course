package Part1_5.Question8;

import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {
        //Ask the user for a number and tell whether it is even or odd.
        //Use the % operator to get the remainder of division by 2.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());

        if (number % 2 == 0) {
            System.out.println("Number " + number + " is even.");
        } else {
            System.out.println("Number " + number + " is odd.");
        }
    }
}
