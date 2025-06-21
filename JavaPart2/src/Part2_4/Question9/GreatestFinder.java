package Part2_4.Question9;

public class GreatestFinder {
    public static void main(String[] args) {
        //Define a method called greatest that takes three integers and returns the greatest of them.
        //If there are multiple greatest values, returning any one of them is sufficient.
        //The method should not print anything; printing will be done in the main method.

        int answer = greatest(2, 7, 3);
        System.out.println("Greatest: " + answer);
    }

    public static int greatest(int number1, int number2, int number3) {
        int greatestSoFar = number1;

        if (number2 > greatestSoFar) {
            greatestSoFar = number2;
        }

        if (number3 > greatestSoFar) {
            greatestSoFar = number3;
        }

        return greatestSoFar;
    }
}
