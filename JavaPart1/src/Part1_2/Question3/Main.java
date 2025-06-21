package Part1_2.Question3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ask the user for a message. When the message is provided,
        //print it three times using separate System.out.println commands.

        Scanner scn = new Scanner(System.in);
        System.out.println("Write a message: ");

        String msg = scn.nextLine();

        System.out.println(msg);
        System.out.println(msg);
        System.out.println(msg);
    }

}
