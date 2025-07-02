package Part4_3.Question6;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class SearchInFile {
    public static void main(String[] args) {
        //You are given two files: names.txt and other-names.txt.
        //Your task is to:
        //  Ask the user for the file name to search in.
        //  Ask the user for a string to search for.
        //  Read the file and check whether the string exists in any line.
        //      ✅ If found → print "Found!"
        //      ❌ If not found → print "Not found."
        //      ⚠️ If file cannot be read → print "Reading the file [filename] failed."

        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        System.out.println("Search for:");
        String searchFor = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            boolean found = false;

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (line.equals(searchFor)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }

        } catch (IOException e) {
            System.out.println("Reading the file " + fileName + " failed.");
        }
    }
}
