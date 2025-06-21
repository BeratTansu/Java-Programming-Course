package Part1_5.Question11;

import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
        //Ask the user for their age.
        //If the age is between 0 and 120 (inclusive), print "OK"
        //Otherwise, print "Impossible!"
        //✅ Use only one if statement.

        Scanner scanner = new Scanner(System.in);

        System.out.print("How old are you? ");
        int age = Integer.valueOf(scanner.nextLine());

        if (age >= 0 && age <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
