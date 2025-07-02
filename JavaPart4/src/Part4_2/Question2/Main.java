package Part4_2.Question2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Implement the program in the class PersonalInformationCollection. Do not modify the provided PersonalInformation class.
        //The program should:
        //  Ask the user repeatedly for first name, last name, and identification number.
        //  When the user enters an empty first name, stop collecting inputs.
        //  Store each person’s data as a PersonalInformation object in a list.
        //  After collecting data, print only the full names (first name + last name), one per line.

        Scanner scanner = new Scanner(System.in);
        ArrayList<PersonelInformation> people = new ArrayList<>();

        while (true) {
            System.out.print("First name: ");
            String firstName = scanner.nextLine();

            if (firstName.isEmpty()) {
                break;
            }

            System.out.print("Last name: ");
            String lastName = scanner.nextLine();

            System.out.print("Identification number: ");
            String id = scanner.nextLine();

            PersonelInformation person = new PersonelInformation(firstName, lastName, id);
            people.add(person);
        }

        System.out.println();

        for (PersonelInformation person : people) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }

    }
}
