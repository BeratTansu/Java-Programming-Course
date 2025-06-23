package Part3_2.Question3;

public class SumOfArray {
    public static void main(String[] args) {
        //Complete the method public static int sumOfNumbersInArray(int[] array)
        //in the class SumOfArray so that it calculates and returns the sum of the numbers in the given array.

        int[] numbers = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(numbers));
    }

    public static int sumOfNumbersInArray(int[] array){
        int sum = 0;
        for (int i : array){
            sum += i;
        }
        return sum;
    }
}
