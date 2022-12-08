package academic;
import course.CourseInformation;
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

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void addGradeToStudent(float midtermGrade, float finalGrade, Student student, Course course) {
        int controlOfCourse = 0, indexOfCourse = 0;
        for (CourseInformation tempCourse : student.getTakenCourses()) {
            if (tempCourse.getCourse() == course) {
                ++controlOfCourse;
                break;
            }
            ++indexOfCourse;
        }
        if (controlOfCourse == 1) {
            student.getTakenCourses().get(indexOfCourse).setMidtermGrade(midtermGrade);
            student.getTakenCourses().get(indexOfCourse).setFinalGrade(finalGrade);
            student.updateGPA();
        }
    }

    public void giveUnderGraduateCertificate(UndergraduateStudent student) throws Exception {
        if (this == getDepartment().getHeadOfDepartment()) {
            if (student.getGPA() >= 2 && student.getTakenCourses().size() == 40) {
            }
        }
        else {
            throw new Exception(String.format("The academician %s %s does not have permission!", getName(), getSurname()));
        }

    }
    public void giveGraduateCertificate(GraduateStudent student) throws Exception {
        if (this == getDepartment().getHeadOfDepartment()) {
            if (student.getGPA() >= 2 && student.getTakenCourses().size() >= 7 ) {
            }
        }
        else {
            throw new Exception(String.format("The academician %s %s does not have permission!", getName(), getSurname()));
        }

    }
}
