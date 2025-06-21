package Part2_4.Question7;

public class SumCalculator {
    public static void main(String[] args) {
        //Expand the method sum so that it calculates and returns the sum of four integer parameters.
        //The method should not print anything — it should return the value.
        //Printing is handled in the main method.

        System.out.println(sum(1,2,3,4));
    }

    public static int sum(int n1, int n2, int n3, int n4){
        int sum = n1 + n2 + n3 + n4;
        return sum;
    }
}
