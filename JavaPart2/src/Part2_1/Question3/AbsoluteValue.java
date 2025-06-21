package Part2_1.Question3;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        //Read an integer from the user.
        //If the number is less than 0, print the number multiplied by -1.
        //Otherwise, print the number itself.

        Scanner scanner = new Scanner(System.in);

        int number = Integer.valueOf(scanner.nextLine());

        if (number < 0) {
            System.out.println(number * -1);
        } else {
            System.out.println(number);
        }
    }
}
