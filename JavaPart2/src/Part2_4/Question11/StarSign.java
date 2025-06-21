package Part2_4.Question11;

public class StarSign{
    public static void main(String[] args) {
        //This exercise consists of 4 parts:
        //  1.Printing stars:
        //      Define a method printStars(int number) that prints the given number of stars (*) on a single line followed by a newline.
        //  2.Printing a square:
        //      Define a method printSquare(int size) that prints a square of stars of given size. The square should be printed by calling the printStars method repeatedly.
        //  3.Printing a rectangle:
        //      Define a method printRectangle(int width, int height) that prints a rectangle of stars with given width and height by calling printStars.
        //  4.Printing a triangle:
        //      Define a method printTriangle(int size) that prints a triangle of stars increasing in length from 1 to size, using printStars.

        // Part 1: printStars
        printStars(5);
        printStars(3);
        printStars(9);

        System.out.println();

        // Part 2: printSquare
        printSquare(4);

        System.out.println();

        // Part 3: printRectangle
        printRectangle(17, 3);

        System.out.println();

        // Part 4: printTriangle
        printTriangle(4);
    }

    public static void printStars(int n){
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
        System.out.println();
    }

    public static void printSquare(int size){
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printRectangle(int width, int height){
        for (int i = 1; i <= height; i++) {
            printStars(width);
        }
    }

    public static void printTriangle(int size){
        for (int i = 1; i <= size; i++) {
            printStars(i);
        }
    }
}
