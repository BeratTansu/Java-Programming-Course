package Part2_4.Question8;

public class SmallestFinder {
    public static void main(String[] args) {
        //Define a method public static int smallest(int number1, int number2)
        //that returns the smaller of the two integers passed to it.
        //The method must not print anything. The result must be returned using return,
        //and printed by the main method.

        System.out.println(smallest(3,2));
    }

    public static int smallest(int n1, int n2){
        if (n1 > n2) {
            return n2;
        }else return n1;
    }
}
