package Part2_2.Question2;

import java.util.Scanner;

public class UntilFour {
    public static void main(String[] args) {
        //Write a program that repeatedly asks the user to give a number until the user inputs 4.
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Write a number: ");
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 4){
                break;
            }
        }
    }
}
