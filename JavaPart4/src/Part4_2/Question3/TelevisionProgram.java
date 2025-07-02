package Part4_2.Question3;

public class TelevisionProgram {
    private String name;
    private int duration;

    public TelevisionProgram(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return this.name;
    }

    public int getDuration() {
        return this.duration;
    }

    public String toString() {
        return this.name + ", " + this.duration + " minutes";
    }
}
