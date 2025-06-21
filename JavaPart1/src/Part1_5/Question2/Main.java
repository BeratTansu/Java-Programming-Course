package Part1_5.Question2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ask the user for an integer. If the number is exactly 1984, print "Orwell".

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());

        if (number == 1984) {
            System.out.println("Orwell");
        }
    }
}
