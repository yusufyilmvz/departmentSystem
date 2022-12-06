package academic;
import course.Course;
import course.CourseInformation;
import departmentSystem.Department;
import departmentSystem.Person;

import java.util.ArrayList;

public class Student extends Person {
    private String idNumber;
    private int year;
    private ArrayList<CourseInformation> takenCourses;

    // Constructor
    // Obligatory part - There mustn't null contructor
    public Student(String identificationNumber, String name, String surname, Department department, String idNumber, int year) {
        super(identificationNumber, name, surname, department);
        this.idNumber = idNumber;
        this.year = year;
        takenCourses = new ArrayList<CourseInformation>();
    }

    // Getters
    // There is no setters because it is read-only

    public String getIdNumber() {
        return idNumber;
    }

    public int getYear() {
        return year;
    }

    public ArrayList<CourseInformation> getTakenCourses() {
        return takenCourses;
    }
}
