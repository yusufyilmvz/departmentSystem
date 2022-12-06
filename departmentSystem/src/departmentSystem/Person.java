package departmentSystem;

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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
