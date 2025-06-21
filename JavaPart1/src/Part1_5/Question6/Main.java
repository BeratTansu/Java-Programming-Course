package Part1_5.Question6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ask the user for two integers. Print the greater one.
        //If they are equal, print "The numbers are equal!".

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());

        if (first > second) {
            System.out.println("Greater number is: " + first);
        } else if (second > first) {
            System.out.println("Greater number is: " + second);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
