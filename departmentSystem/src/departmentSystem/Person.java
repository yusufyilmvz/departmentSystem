package departmentSystem;

public abstract class Person {
    private String identificationNumber;
    private String name;
    private String surname;

    // Constructors
    public Person(String identificationNumber, String name, String surname) {
        this.identificationNumber = identificationNumber;
        this.name = name;
        this.surname = surname;
    }

    public Person() {
    }

    // getter and setters
    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
