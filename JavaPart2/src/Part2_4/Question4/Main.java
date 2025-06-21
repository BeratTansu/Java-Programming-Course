package Part2_4.Question4;

public class Main {
    public static void main(String[] args) {
        //Create a method public static void printFromNumberToOne(int number)
        //that prints numbers from the given number down to one.

        printFromNumberToOne(5); // örnek kullanım
    }

    public static void printFromNumberToOne(int number) {
        while (number >= 1) {
            System.out.println(number);
            number--;
        }
    }
}
