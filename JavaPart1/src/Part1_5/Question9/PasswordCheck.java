package Part1_5.Question9;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        //Ask the user for a password.
        //If it's "Caput Draconis", print "Welcome!", otherwise print "Off with you!".

        Scanner scanner = new Scanner(System.in);

        System.out.println("Password?");
        String input = scanner.nextLine();

        if (input.equals("Caput Draconis")) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}
