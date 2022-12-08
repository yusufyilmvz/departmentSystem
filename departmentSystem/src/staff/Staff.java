package staff;

import departmentSystem.Department;
import departmentSystem.Person;


public class Staff extends Person {

    private String workingPlace;
    private int workingHours;
    public Staff(String identificationNumber, String name, String surname, Department department, String workingPlace, int workingHours) {
        super(identificationNumber, name, surname, department);
        this.workingPlace = workingPlace;
        this.workingHours = workingHours;
    }

    // Method(s)

    @Override
    public String toString() {
        return String.format("Identification number: %s\nName: %s\nSurname: %s\nDepartment: %s\nWorkingPlace: %s\nWorking hours: %d",
                                    getIdentificationNumber(), getName(), getSurname(), getDepartment().getDepartmentName(), getWorkingPlace(), getWorkingHours());
    }
    public String getWorkingPlace() {
        return workingPlace;
    }

    public void setWorkingPlace(String workingPlace) {
        this.workingPlace = workingPlace;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHors(int workingHors) {
        this.workingHours = workingHors;
    }



}
