package Part3_1.Question13;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchNameInList {
    public static void main(String[] args) {
        //In the exercise template there is a program that reads inputs from the user until an empty string is entered.
        //Add the following functionality to it: after reading the inputs,
        //ask the user for one more string and then tell whether that string was found in the list or not.

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        while (true){
            System.out.println("Give a string: ");
            String input = scanner.nextLine();

            if (input.isEmpty()){
                break;
            }

            names.add(input);
        }

        System.out.println("Search for? ");
        String searchName = scanner.nextLine();

        if (names.contains(searchName)){
            System.out.println(searchName + "was found!");
        } else {
            System.out.println(searchName + "was not found!");
        }

//        for (int i = 0; i < names.size(); i++) {                  that's also true.
//            if (searchName.equals(names.get(i))){
//                System.out.println(searchName + "was found!");
//                break;
//            } else {
//                System.out.println(searchName + "was not found!");
//            }
//        }
    }
}
