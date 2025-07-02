package Part4_2.Question3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Implement a program using the ready-made TelevisionProgram class, which stores the name and duration of a TV show.
        //Your program should:
        //  Repeatedly ask the user for:
        //      Name of a TV program
        //      Its duration in minutes
        //  Stop reading inputs when the name is empty.
        //  Then, ask the user for a maximum duration (an integer).
        //  Finally, print only the TV programs whose durations are less than or equal to the given maximum.

        Scanner scanner = new Scanner(System.in);
        ArrayList<TelevisionProgram> programs = new ArrayList<>();

        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.print("Duration: ");
            int duration = Integer.parseInt(scanner.nextLine());

            programs.add(new TelevisionProgram(name, duration));
        }

        System.out.println();
        System.out.print("Program's maximum duration? ");
        int maxDuration = Integer.parseInt(scanner.nextLine());

        for (TelevisionProgram program : programs) {
            if (program.getDuration() <= maxDuration) {
                System.out.println(program);
            }
        }
    }
}
