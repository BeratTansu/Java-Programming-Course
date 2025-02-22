import java.util.Arrays;

public class MainApp {
    public static void main(String[]args){
        int[] array = ArrayApp.value_with_scanner();
        ArrayApp.array1D_print(array);
        ArrayApp.findMin(array);
        System.out.println("Minimum value: " + ArrayApp.findMin(array));
        System.out.println("Maximum value: " + ArrayApp.findMax(array));

        System.out.println("Original array: ");
        ArrayApp.array1D_print(array);
        System.out.println("Reversed array: ");
        ArrayApp.reverseArray(array);

        int[][] result = ArrayApp.separateOddEven(array);
        System.out.println("Even numbers: " + Arrays.toString(result[0]));
        System.out.println("Odd numbers: " + Arrays.toString(result[1]));

        ArrayApp.dizi_ort(array);
    }
}
