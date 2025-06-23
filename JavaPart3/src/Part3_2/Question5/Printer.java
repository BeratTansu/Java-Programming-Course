package Part3_2.Question5;

public class Printer {
    public static void main(String[] args) {
        //Complete the method public static void printArrayInStars(int[] array)
        //in the class named 'Printer' so that it prints a row of stars (*) for each number in the array.
        //The number of stars on each row must match the value at that index in the array.

        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array){
//        for (int number : array) {                    That's also true.
//            System.out.println("*".repeat(number));
//        }

        for (int number : array){
            for (int i = 0; i < number; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
