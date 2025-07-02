package Part4_1.Question15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //You are to create a class called Statistics that handles a few numerical statistics:
        // count, sum, and average. Then, you’ll use it in various programs.
        //Part 1 — Count
        //  Create a class Statistics with an instance variable for count.
        //  Implement the following methods:
        //      public void addNumber(int number)   // increases the count
        //      public int getCount()               // returns the total count
        //Part 2 — Sum & Average
        //  Extend the Statistics class so it can also calculate the sum and average of the added numbers.
        //  Add these methods:
        //      public int sum()                  // returns the total sum
        //      public double average()           // returns the average
        //Part 3 — Sum of User Inputs
        //  Write a program that asks the user for numbers until -1 is entered.
        //  Use a Statistics object to store the sum and count.
        //  Print the sum when done.
        //Part 4 — Multiple Sums (All / Even / Odd)
        //  Extend your main program from Part 3. Create 3 separate Statistics objects:
        //      Total numbers
        //      Even numbers
        //      Odd numbers
        //  Each time the user inputs a number (except -1), store it in the appropriate Statistics object(s). At the end, print:
        //      Total sum
        //      Even sum
        //      Odd sum

        Scanner scanner = new Scanner(System.in);
        Statistic allStats = new Statistic();
        Statistic evenStats = new Statistic();
        Statistic oddStats = new Statistic();

        System.out.println("Please enter numbers: ");
        while (true){
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1){
                break;
            }

            allStats.addNumber(number);

            if (number % 2 == 0){
                evenStats.addNumber(number);
            } else {
                oddStats.addNumber(number);
            }
        }

        System.out.println("Sum: " + allStats.sum());
        System.out.println("Sum of even numbers: " + evenStats.sum());
        System.out.println("Sum of odd numbers: " + oddStats.sum());
    }
}
