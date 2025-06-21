package Part1_3.Question2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Write a program that asks the user: "Give a number:".
        //After the user enters a number, print: "You gave the number <number>".

        Scanner scn = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.parseInt(scn.nextLine());

        System.out.println("You gave the number " + number);
    }
}
