package Part3_1.Question4;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintLastValue {
    public static void main(String[] args) {
        //The exercise template contains a program that reads strings from the user and adds them to a list.
        //Reading ends when the user enters an empty string ("").
        //Your task is to modify the program so that after reading ends,
        //it prints the last value entered by the user — that is, the last item in the list.
        //Use the list's .size() method and indexing (.get(index)) to retrieve the last item.

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        while (true){
            System.out.println("İnput a string: ");
            String input = scanner.nextLine();

            if (input.equals("")){
                break;
            }

            inputs.add(input);
        }

        int lastString = inputs.size()-1;
        //String lastString = inputs.getLast(); that's also true.
        System.out.println(lastString);
    }
}
