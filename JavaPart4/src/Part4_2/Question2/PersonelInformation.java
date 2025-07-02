package Part4_2.Question2;

public class PersonelInformation {
    private String firstName;
    private String lastName;
    private String identificationCode;

    public PersonelInformation(String firstName, String lastName, String identificationCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identificationCode = identificationCode;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getIdentificationCode() {
        return this.identificationCode;
    }
}
