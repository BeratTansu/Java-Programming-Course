package Part3_1.Question5;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLastValue {
    public static void main(String[] args) {
        //The exercise template contains a program that reads strings from the user and adds them to a list.
        //Reading stops when the user enters an empty string ("").
        //✅ Modify the program so that after reading ends, it prints both:
        //  The first value in the list
        //  The last value in the list

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        while (true){
            System.out.println("İnput a String: ");
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }

            inputs.add(input);
        }

        System.out.println("First String : " + inputs.getFirst());
        System.out.println("Last String : " + inputs.getLast());
    }
}
