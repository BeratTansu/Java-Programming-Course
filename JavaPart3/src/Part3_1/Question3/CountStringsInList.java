package Part3_1.Question3;

import java.util.ArrayList;
import java.util.Scanner;

public class CountStringsInList {
    public static void main(String[] args) {
        //The exercise template contains a program that reads strings from the user and adds them to a list.
        //Input ends when the user enters an empty string ("").
        //Modify the program so that after the reading ends,
        //it prints the total number of entered values (i.e., the size of the list).

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        while (true){
            System.out.println("Give a string: ");
            String input = scanner.nextLine();

            if (input.isEmpty()){
                break;
            }

            inputs.add(input);
        }

        System.out.println("In total = " + inputs.size());
    }
}
