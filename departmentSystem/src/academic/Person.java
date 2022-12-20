package academic;

public abstract class Person {
    private String identificationNumber;
    private String name;
    private String surname;
    private Department department;

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

    protected void setDepartment(Department department) throws Exception {
        this.department = department;
    }
}
