package Part1_2.Question6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Write a program that:
        //Prints: I will tell you a story, but I need some information first.
        //Asks for a name and job.
        //Prints a short story using the given inputs, in the format shown below.

        Scanner scn = new Scanner(System.in);

        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String name = scn.nextLine();

        System.out.println("What is their job?");
        String job = scn.nextLine();

        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was " + name + ", who was " + job + ".");
        System.out.println("On the way to work, " + name + " reflected on life.");
        System.out.println("Perhaps " + name + " will not be " + job + " forever.");
    }
}
