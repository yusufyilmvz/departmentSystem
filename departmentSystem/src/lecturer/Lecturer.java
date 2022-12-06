package lecturer;
import course.Course;

import java.util.ArrayList;

public class Lecturer {
    private String identificationNumber;
    private String name;
    private String surname;
    private ArrayList<Course> courses;

    public Lecturer(String identificationNumber, String name, String surname) {
        this.identificationNumber = identificationNumber;
        this.name = name;
        this.surname = surname;
        courses = new ArrayList<Course>();
    }

    // This function takes a course argument and add it to the list.
    public void addCourse(Course course) throws Exception {
        // If the lecturer has more than 10 course it throws an error.
        if (courses.size() > 10) {
            throw new Exception(String.format("The lecturer who has %s id number access to max course number", this.identificationNumber));
        } else {
            courses.add(course);
        }
    }

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
}
