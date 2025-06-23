package Part3_2.Question1;

import java.util.Scanner;

public class ArraySwap {
    public static void main(String[] args) {
        //The program already creates an array and prints its values twice.
        //Your task is to modify the program so that:
        //  After the first print, the program asks the user for two indices.
        //  Then it swaps the values in these indices.
        //  Finally, the program prints the array again after the swap.

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1,3,5,7,9};

        for (int number : numbers){
            System.out.println(number);
        }

        System.out.println("\nGive two indices to swap: ");
        int index1 = Integer.parseInt(scanner.nextLine());
        int index2 = Integer.parseInt(scanner.nextLine());

        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;

        System.out.println();
        for (int number : numbers){
            System.out.println(number);
        }
    }
}
