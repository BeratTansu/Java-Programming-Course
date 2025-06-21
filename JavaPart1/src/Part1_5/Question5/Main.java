package Part1_5.Question5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ask the user for their age. If the age is 18 or more, print "You are an adult".
        //Otherwise, print "You are not an adult".

        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = Integer.valueOf(scanner.nextLine());

        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an adult");
        }
    }
}
