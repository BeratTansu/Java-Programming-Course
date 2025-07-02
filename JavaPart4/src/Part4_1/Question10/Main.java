package Part4_1.Question10;

public class Main {
    public static void main(String[] args) {
        //Create a class called Song.
        //It should have two instance variables:
        //  name (a String)
        //  length (an int, in seconds)
        //These should be set in the constructor public Song(String name, int length)
        //Add the following methods:
        //  public String name() → returns the name of the song
        //  public int length() → returns the length of the song

        Song garden = new Song("In The Garden", 10910);
        System.out.println("The song " + garden.name() + " has a length of " + garden.length() + " seconds.");
    }
}
