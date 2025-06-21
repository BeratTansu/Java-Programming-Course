package Part1_3.Question5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Write a program that asks for a string, an integer, a double, and a boolean from the user,
        //then prints all of them.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a string:");
        String str = scanner.nextLine();

        System.out.println("Give an integer:");
        int integer = Integer.parseInt(scanner.nextLine());

        System.out.println("Give a double:");
        double dbl = Double.parseDouble(scanner.nextLine());

        System.out.println("Give a boolean:");
        boolean bool = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("You gave the string " + str);
        System.out.println("You gave the integer " + integer);
        System.out.println("You gave the double " + dbl);
        System.out.println("You gave the boolean " + bool);
    }
}
