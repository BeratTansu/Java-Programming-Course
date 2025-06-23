package Part3_2.Question4;

public class ArrayPrinter {
    public static void main(String[] args) {
        //Complete the method public static void printNeatly(int[] array) in the class named ArrayPrinter,
        //so that it prints the numbers of the array in a neat format.
        //Each number should be followed by a comma and a space — except the last number,
        //which should not be followed by a comma.

        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1){
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
    }
}
