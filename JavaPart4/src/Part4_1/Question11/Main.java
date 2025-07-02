package Part4_1.Question11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create a Film class with:
        //  Instance variables:
        //      name (a String)
        //      ageRating (an int)
        //  Constructor:
        //      public Film(String filmName, int filmAgeRating)
        //  Methods:
        //      public String name() → returns the name of the film
        //      public int ageRating() → returns the age rating of the film

        Film chipmunks = new Film("Alvin and the Chipmunks: The Squeakquel", 0);

        Scanner reader = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = Integer.valueOf(reader.nextLine());

        if (age >= chipmunks.ageRating()) {
            System.out.println("You may watch the film " + chipmunks.name());
        } else {
            System.out.println("You may not watch the film " + chipmunks.name());
        }
    }
}
