package academic;

import departmentSystem.Department;

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

    public Person() {
    }

    // Abstract function(s)
    public abstract String toString();

    // getter and setters
    public String getIdentificationNumber() {
        return identificationNumber;
    }

    protected void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    protected void setSurname(String surname) {
        this.surname = surname;
    }

    public Department getDepartment() {
        return department;
    }

    protected void setDepartment(Department department) {
        this.department = department;
    }
}
