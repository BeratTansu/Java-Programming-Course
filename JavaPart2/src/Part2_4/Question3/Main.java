package Part2_4.Question3;

public class Main {
    public static void main(String[] args) {
        //Create a method public static void printUntilNumber(int number)
        //that prints numbers from 1 up to the number given as a parameter.

        printUntilNumber(5); // örnek kullanım
    }

    public static void printUntilNumber(int number) {
        int i = 1;
        while (i <= number) {
            System.out.println(i);
            i++;
        }
    }
}
