package staff;

import departmentSystem.Department;
import departmentSystem.Person;

public class staff extends Person {

    private String workingPlace;
    private int workingHours;
    public staff(String identificationNumber, String name, String surname, Department department,String workingPlace,int workingHours) {
        super(identificationNumber, name, surname, department);
        this.workingPlace = workingPlace;
        this.workingHours = workingHours;
    }

    public String getWorkingPlace() {
        return workingPlace;
    }

    public void setWorkingPlace(String workingPlace) {
        this.workingPlace = workingPlace;
    }

    public int getWorkingHors() {
        return workingHours;
    }

    public void setWorkingHors(int workingHors) {
        this.workingHours = workingHors;
    }
}
