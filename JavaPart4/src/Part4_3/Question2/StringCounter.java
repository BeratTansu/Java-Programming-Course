package Part4_3.Question2;

import java.util.Scanner;

public class StringCounter {
    public static void main(String[] args) {
        //Write a program that:
        //  Reads strings from the user until "end" is input.
        //  If the input is not "end", treat it as an integer.
        //  For each integer input, print its cube (number * number * number).

        Scanner scanner = new Scanner(System.in);

        while (true){
            String input = scanner.nextLine();

            if (input.equals("end")){
                break;
            }

            int number = Integer.valueOf(input);
            System.out.println(number*number*number);
        }


    }
}
