package staff;

import academic.Department;
import academic.Person;


public class Staff extends Person {

    private String workingPlace;
    private int workingHours;
    private String taskInformation;

    public Staff(String identificationNumber, String name, String surname, Department department, String workingPlace, int workingHours, String taskInformation) {
        super(identificationNumber, name, surname, department);
        this.workingPlace = workingPlace;
        this.workingHours = workingHours;
        this.taskInformation = taskInformation;
    }

    public Staff(String identificationNumber, String name, String surname, Department department) {
        super(identificationNumber, name, surname, department);
    }

    // Method(s)

    @Override
    public String toString() {
        return String.format("Identification number: %s\nName: %s\nSurname: %s\nDepartment: %s\nWorkingPlace: %s\nWorking hours: %d\nTask Information: %s",
                                    getIdentificationNumber(), getName(), getSurname(), getDepartment().getDepartmentName(), getWorkingPlace(), getWorkingHours(), getTaskInformation());
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

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public String getTaskInformation() {
        return taskInformation;
    }

    public void setTaskInformation(String taskInformation) {
        this.taskInformation = taskInformation;
    }
}
