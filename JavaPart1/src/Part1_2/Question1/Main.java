package Part1_2.Question1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Write a Java program that asks the user to "Write a message:".
        //Once the user enters a message and presses Enter, the program should print the exact same message again.

        Scanner scn = new Scanner(System.in);
        System.out.println("Write a message: ");
        String msg = scn.nextLine();
        System.out.println(msg);
    }
}
