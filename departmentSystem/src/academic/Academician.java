package academic;
import departmentSystem.Department;
import departmentSystem.Person;
import course.Course;

import java.util.ArrayList;

public class Academician extends Person{
    // Course list
    private ArrayList<Course> courses;

    // Constructor
    public Academician(String identificationNumber, String name, String surname, Department department) {
        super(identificationNumber, name, surname, department);
        courses = new ArrayList<Course>();
    }

    // Methods
    // if number of the courses that attended to academician are more than 10, it throws an execption. Otherwise, it adds course to academician
    public void addCourse(Course course) throws Exception{
        if (courses.size() >= 10) {
            throw new Exception(String.format("The lecturer who has \"%s\" id number access to max course number !", super.getIdentificationNumber()));
        } else {
            courses.add(course);
        }
    }

    public String toString() {
        return String.format("Identification number: %s\nName: %s\nSurname: %s\nDepartment: %s",
                getIdentificationNumber(), getName(), getSurname(), getDepartment().getDepartmentName());
    }

    // tam bitmedi algoritması kurulacak !!!!!! bu fonksiyon başka yere de alınabilir.
    public void addStudentToTheCourse(Student student, Course course) throws Exception {
        int tempValue = 0, indexOfCourse = 0;
        for(Course tempCourse : courses) {
            if (tempCourse == course) {
                ++tempValue;
                break;
            }
            ++indexOfCourse;
        }
        if (tempValue != 0) {
            int tempValue2 = 0, indexOfStudent = 0;
            for (Student tempStudent : courses.get(indexOfCourse).getStudents()) {
                if (tempStudent == student) {
                    ++tempValue2;
                    break;
                }
                ++indexOfStudent;
            }
            if (tempValue2 != 0) {
                courses.get(indexOfCourse).getStudents().add(student);
            }
            else {
                throw new Exception("This course already contains the student who is tried to entrolling!");
            }
        }
        else {
            throw new Exception("There is no course that is given as an arguman!");
        }
    }
}
