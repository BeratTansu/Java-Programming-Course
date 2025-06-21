package Part1_2.Question5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Write a program that asks the user "Greetings! How are you doing?"
        //Then, after reading the user’s answer, say:
        //"Oh, how interesting. Tell me more!"
        //Then after the second input, say:
        //"Thanks for sharing!"

        Scanner scn = new Scanner(System.in);

        System.out.println("Greetings! How are you doing?");
        String firstResponse = scn.nextLine();

        System.out.println("Oh, how interesting. Tell me more!");
        String secondResponse = scn.nextLine();

        System.out.println("Thanks for sharing!");
    }
}
