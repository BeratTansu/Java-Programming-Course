package Part2_3.Question3;

import java.util.Scanner;

public class FromWhereToWhere {
    public static void main(String[] args) {
        //Write a program that:
        //Asks the user “Where to?”
        //Then asks “Where from?”
        //Then prints all numbers from the starting point to the end point (inclusive).
        //If the starting point is greater than the ending point, nothing is printed.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Where to? ");
        int whereTo = Integer.valueOf(scanner.nextLine());

        System.out.print("Where from? ");
        int whereFrom = Integer.valueOf(scanner.nextLine());

        if (whereFrom <= whereTo) {
            for (int i = whereFrom; i <= whereTo; i++) {
                System.out.println(i);
            }
        }
    }
}
