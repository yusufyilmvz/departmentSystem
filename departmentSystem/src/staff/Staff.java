package staff;

import academic.Department;
import academic.Person;
import area.Area;

import java.util.ArrayList;

// Staff class extends Person class
public abstract class Staff extends Person {
    // Attributes
    private int workingHours;
    private String taskInformation;
    private double salary;
    private ArrayList<Area> workingPlaces;

    // Constructors
    public Staff(String identificationNumber, String name, String surname, Department department, int workingHours, String taskInformation) {
        super(identificationNumber, name, surname, department);
        this.workingHours = workingHours;
        this.taskInformation = taskInformation;
        workingPlaces = new ArrayList<Area>();
        salary = 5500;
        department.getStaffsInDepartment().add(this);
    }

    public Staff(String identificationNumber, String name, String surname, Department department) {
        super(identificationNumber, name, surname, department);
        workingPlaces = new ArrayList<Area>();
        salary = 5500;
        department.getStaffsInDepartment().add(this);
    }

    // Obligatory constructor
    public Staff(String identificationNumber, String name, String surname, int workingHours, String taskInformation) {
        super(identificationNumber, name, surname);
        this.workingHours = workingHours;
        this.taskInformation = taskInformation;
    }

    // Method(s)

    @Override
    public String toString() {
        return String.format("Identification number: %s\nName: %s\nSurname: %s\nDepartment: %s\nWorking hours: %d\nTask Information: %s\n",
                                    getIdentificationNumber(), getName(), getSurname(), getDepartment().getDepartmentName(), getWorkingHours(), getTaskInformation());
    }

    // Shows working places
    public void showWorkingPlaces() {
        for (Area area : workingPlaces) {
            System.out.println(area);
        }
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
