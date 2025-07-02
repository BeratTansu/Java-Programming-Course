package Part4_3.Question1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Write a program that:
        //  Reads strings from the user until the input is "end".
        //  After that, print how many strings were read (excluding "end").
        //The string "end" does not count toward the total.

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true){
            String input = scanner.nextLine();

            if (input.equals("end")){
                break;
            }

            count++;
        }

        System.out.println(count);
    }
}
