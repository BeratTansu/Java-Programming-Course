package Part4_3.Question4;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class FilePrinter {
    public static void main(String[] args) {
        //Write a program that asks the user for a filename and prints the contents of that file.
        //You may assume the user will enter a valid filename that exists in your project folder.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a file name: ");
        String name = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(name))){
            while (fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
        } catch (IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
