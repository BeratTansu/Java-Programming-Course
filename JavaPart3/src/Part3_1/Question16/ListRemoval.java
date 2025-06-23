package Part3_1.Question16;

import java.util.ArrayList;

public class ListRemoval {
    public static void main(String[] args) {
        //Create a method called public static void removeLast(ArrayList<String> strings)
        //that removes the last element from the list given as a parameter.
        //If the list is empty, the method should do nothing.
        //If the list has at least one element, it should remove the last one.

        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }

    public static void removeLast(ArrayList<String> strings){
        //strings.removeLast(); that's also true.

        strings.remove(strings.size()-1);
    }
}
