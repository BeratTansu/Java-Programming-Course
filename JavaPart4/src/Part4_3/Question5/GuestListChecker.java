package Part4_3.Question5;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListChecker {
    public static void main(String[] args) {
        //The program checks if names entered by the user are on a guest list.
        // However, the list of guests is currently missing.
        //Your task is to load the guest list from a file.
        //Ask the user for the file name and read each line in the file into a list.
        //Then check if the names entered by the user are in that list.

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> guestList = new ArrayList<>();

        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        // Dosyadaki isimleri listeye ekle
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String name = fileScanner.nextLine();
                guestList.add(name);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }

        System.out.println("\nEnter names, an empty line quits.");
        while (true) {
            String inputName = scanner.nextLine();
            if (inputName.isEmpty()) {
                break;
            }

            if (guestList.contains(inputName)) {
                System.out.println("The name is on the list.");
            } else {
                System.out.println("The name is not on the list.");
            }
        }

        System.out.println("\nThank you!");
    }
}
