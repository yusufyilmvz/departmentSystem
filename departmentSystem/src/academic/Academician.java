package academic;
import departmentSystem.Department;
import departmentSystem.Person;
import course.Course;

import java.util.ArrayList;

public class Academician extends Person{
    private ArrayList<Course> courses;

    // Constructor
    public Academician(String identificationNumber, String name, String surname, Department department) {
        super(identificationNumber, name, surname, department);
        courses = new ArrayList<Course>();
    }

    public void addCourse(Course course) throws Exception{
        if (courses.size() >= 10) {
            System.out.println("Worked");
            throw new Exception(String.format("The lecturer who has %s id number access to max course number", super.getIdentificationNumber()));
        } else {
            courses.add(course);
            System.out.println(courses.size());
        }

    }
}
