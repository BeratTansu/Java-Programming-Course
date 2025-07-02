package Part4_1.Question5;

public class Main {
    public static void main(String[] args) {
        //Create a class named Whistle.
        //Add a private variable String sound to the class.
        //Create a constructor public Whistle(String whistleSound) that assigns the given sound to the sound variable.
        //Create a method public void sound() that prints the whistle's sound.

        Whistle duckWhistle = new Whistle("Kvaak");
        Whistle roosterWhistle = new Whistle("Peef");

        duckWhistle.sound();
        roosterWhistle.sound();
        duckWhistle.sound();
    }
}
