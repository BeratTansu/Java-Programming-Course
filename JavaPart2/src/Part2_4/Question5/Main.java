package Part2_4.Question5;

public class Main {
    public static void main(String[] args) {
        //Write a method public static void division(int numerator, int denominator)
        //that prints the result of dividing the numerator by the denominator as a floating point number (i.e., a decimal result).
        //Although the parameters are integers, the division should return a decimal (e.g., 0.6 instead of 0).

        division(3, 5); // örnek kullanım
    }

    public static void division(int numerator, int denominator) {
        double result = (double) numerator / denominator;
        System.out.println(result);
    }
}
