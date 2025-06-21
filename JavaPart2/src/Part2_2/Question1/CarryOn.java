package Part2_2.Question1;

import java.util.Scanner;

public class CarryOn {
    public static void main(String[] args) {
        //Write a program that asks the user "Shall we carry on?" repeatedly until the user types "no".

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Shall we carry on?");
            String answer = scanner.nextLine();

            if (answer.equals("no")) {
                break;
            }
        }
    }
}
