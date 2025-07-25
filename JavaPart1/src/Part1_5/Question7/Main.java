package Part1_5.Question7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ask the user for a number between 0 and 100,
        //then print the corresponding grade according to the given table.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give points [0-100]:");
        int points = Integer.valueOf(scanner.nextLine());

        if (points < 0) {
            System.out.println("Grade: impossible!");
        } else if (points < 50) {
            System.out.println("Grade: failed");
        } else if (points < 60) {
            System.out.println("Grade: 1");
        } else if (points < 70) {
            System.out.println("Grade: 2");
        } else if (points < 80) {
            System.out.println("Grade: 3");
        } else if (points < 90) {
            System.out.println("Grade: 4");
        } else if (points <= 100) {
            System.out.println("Grade: 5");
        } else {
            System.out.println("Grade: incredible!");
        }
    }
}
