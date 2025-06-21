package Part1_5.Question3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ask the user for a year. If it’s smaller than 2015, print "Ancient history!".

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a year:");
        int year = Integer.valueOf(scanner.nextLine());

        if (year < 2015) {
            System.out.println("Ancient history!");
        }
    }
}
