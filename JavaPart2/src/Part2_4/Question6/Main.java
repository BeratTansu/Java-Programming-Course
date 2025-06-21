package Part2_4.Question6;

public class Main {
    public static void main(String[] args) {
        //Write a method public static void divisibleByThreeInRange(int beginning, int end)
        //that prints all the numbers divisible by three in the given range from beginning to end (inclusive).
        //The numbers should be printed in order from smallest to greatest.

        divisibleByThreeInRange(1,10);
    }

    public static void divisibleByThreeInRange(int beginning, int end){
        for (int i = beginning; i <= end; i++) {
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
