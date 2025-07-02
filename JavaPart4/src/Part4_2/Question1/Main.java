package Part4_2.Question1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Implement the class Items. Do not modify the class Item.
        //The program should:
        //  Ask the user for item names repeatedly.
        //  Stop when an empty string is entered.
        //  Add each item to a list.
        //  After reading input, print all items using their toString() method.
        //  The Item class already tracks the name and creation time.

        Scanner scanner = new Scanner(System.in);

        ArrayList<Item> items = new ArrayList<>();

        while (true){
            System.out.print("Name: ");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            items.add(new Item(input));
        }

        for (Item item : items) {
            System.out.println(item);
        }
    }
}
