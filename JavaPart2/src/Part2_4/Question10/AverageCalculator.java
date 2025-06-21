package Part2_4.Question10;

public class AverageCalculator {
    public static void main(String[] args) {
        //Create a method called average that calculates the average of four integers passed as parameters.
        //Use the previously created sum method inside this method to calculate the total sum first.
        //Return the average as a double.

        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }

    public static int sum(int number1, int number2, int number3, int number4) {
        return number1 + number2 + number3 + number4;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        int total = sum(number1, number2, number3, number4);
        return total / 4.0;  // 4.0 ile bölerek double sonuç alıyoruz
    }
}
