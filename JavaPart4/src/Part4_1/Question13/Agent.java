package Part4_1.Question13;

public class Agent {
    private String firstName;
    private String lastName;

    public Agent(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString(){
        return "My name is " + lastName + ", " + firstName + " " + lastName;
    }
}
