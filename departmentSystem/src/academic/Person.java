package academic;

// Person abstract class
public abstract class Person {
    // Attributes
    private int id; // ID information of the person
    private String identificationNumber; // Identification number of the person
    private String name; // Name of the person
    private String surname; // Surname of the person
    private Department department; // Department of the person(computer engineering etc.)

    // Constructors
    public Person(String identificationNumber, String name, String surname, Department department) {
        this.identificationNumber = identificationNumber;
        this.name = name;
        this.surname = surname;
        this.department = department;
    }

    public Person(String identificationNumber, String name, String surname) {
        this.identificationNumber = identificationNumber;
        this.name = name;
        this.surname = surname;
    }

    // Abstract function(s)
    public abstract String toString();

    // getter and setters
    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Department getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    protected void setDepartment(Department department) {
        this.department = department;
    }
}
