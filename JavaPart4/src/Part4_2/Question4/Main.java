package Part4_2.Question4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Write a program that:
        //  Repeatedly asks the user for:
        //      Title of a book
        //      Pages
        //      Publication year
        //  Stops when the title is an empty string.
        //  Then asks: What information will be printed?
        //      If the user types "everything", print title, pages, and year for each book.
        //      If the user types "name", print only the title of each book.

        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.print("Publication year: ");
            int year = Integer.parseInt(scanner.nextLine());

            books.add(new Book(title, pages, year));
        }

        System.out.println();
        System.out.print("What information will be printed? ");
        String command = scanner.nextLine();

        System.out.println();
        if (command.equals("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else if (command.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }
    }
}
