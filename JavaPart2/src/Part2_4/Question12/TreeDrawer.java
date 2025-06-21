package Part2_4.Question12;

public class TreeDrawer {
    public static void main(String[] args) {
        //1.Printing stars and spaces:
        //  Define a method printSpaces(int number) that prints the given number of spaces (' ') on a single line (no line break).
        //  You should also implement or reuse the method printStars(int number).
        //
        //2.Printing a right-leaning triangle:
        //  Define a method printTriangle(int size) that prints a triangle leaning to the right using printSpaces and printStars.
        //  Example for printTriangle(4):
        //     *
        //    **
        //   ***
        //  ****
        //3.Printing a Christmas tree:
        //  Define a method christmasTree(int height) that prints:
        //  A triangle of given height with odd-numbered rows of stars, centered with spaces.
        //  A trunk that is 2 rows high and 3 stars wide, also centered.
        //  Example output for christmasTree(4):
        //     *
        //    ***
        //   *****
        //  *******
        //    ***
        //    ***

        System.out.println("Triangle:");
        printTriangle(4);

        System.out.println("\nChristmas Tree:");
        christmasTree(4);

        System.out.println("\nBig Tree:");
        christmasTree(10);
    }

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // Triangle part
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars(i * 2 - 1); // 1, 3, 5, ...
        }

        // Base part (2 rows, 3 stars)
        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2); // center the 3 stars
            printStars(3);
        }
    }
}
