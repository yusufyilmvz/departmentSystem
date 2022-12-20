package staff;

import academic.Department;
import academic.Person;
import area.Area;

import java.util.ArrayList;


public abstract class Staff extends Person {
    private int workingHours;
    private String taskInformation;
    private ArrayList<Area> workingPlaces;

    public Staff(String identificationNumber, String name, String surname, Department department, int workingHours, String taskInformation) {
        super(identificationNumber, name, surname, department);
        this.workingHours = workingHours;
        this.taskInformation = taskInformation;
        workingPlaces = new ArrayList<Area>();

    }

    public Staff(String identificationNumber, String name, String surname, Department department) {
        super(identificationNumber, name, surname, department);
        workingPlaces = new ArrayList<Area>();
    }

    // Method(s)

    @Override
    public String toString() {
        return String.format("Identification number: %s\nName: %s\nSurname: %s\nDepartment: %s\nWorking hours: %d\nTask Information: %s",
                                    getIdentificationNumber(), getName(), getSurname(), getDepartment().getDepartmentName(), getWorkingHours(), getTaskInformation());
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

    public ArrayList<Area> getWorkingPlaces() {
        return workingPlaces;
    }
}
