package Part1_5.Question1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ask the user for an integer. If it's greater than 120, print "Speeding ticket!".

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give speed:");
        int speed = Integer.valueOf(scanner.nextLine());

        if (speed > 120) {
            System.out.println("Speeding ticket!");
        }
    }
}
