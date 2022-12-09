package academic;

import course.CourseInformation;
import departmentSystem.Department;
import course.Course;

import java.util.ArrayList;


public class Academician extends Person {
    // Course list
    private ArrayList<Course> courses;

    // Constructor
    public Academician(String identificationNumber, String name, String surname, Department department) {
        super(identificationNumber, name, surname, department);
        courses = new ArrayList<Course>();
    }

    // Methods

    public String toString() {
        return String.format("Identification number: %s\nName: %s\nSurname: %s\nDepartment: %s",
                getIdentificationNumber(), getName(), getSurname(), getDepartment().getDepartmentName());
    }

    protected ArrayList<Course> getCourses() {
        return courses;
    }

    public void addGradeToStudent(Student student, Course course, float midtermGrade, float finalGrade) throws Exception {
        int controlOfCourse = 0, indexOfCourse = 0;
        for (CourseInformation tempCourse : student.getTakenCourses()) {
            if (tempCourse.getCourse() == course) {
                ++controlOfCourse;
                break;
            }
            ++indexOfCourse;
        }
        if (controlOfCourse != 0) {
            int controller = 0;
            for (Course tempCourse : courses) {
                if (tempCourse == course) {
                    ++controller;
                    break;
                }
            }
            if (controller != 0) {
                student.getTakenCourses().get(indexOfCourse).setMidtermGrade(midtermGrade);
                student.getTakenCourses().get(indexOfCourse).setFinalGrade(finalGrade);
                student.updateGPA();
            } else {
                throw new Exception(String.format("The lecturer %s %s is not the lecturer of the lesson called %s !", getName(), getSurname(), course.getCourseName()));
            }

        } else {
            throw new Exception(String.format("%s %s is not registered to the course called %s !", student.getName(), student.getSurname(), course.getCourseName()));
        }
    }

    public void showCourses() {
        int i = 0;
        for (Course course : courses) {
            System.out.printf("%d-\t", i);
            System.out.println(course);
        }
    }

    public void giveUnderGraduateCertificate(UndergraduateStudent student) throws Exception {
        if (this == getDepartment().getHeadOfDepartment()) {
            if (student.getGPA() >= 2 && student.getTakenCourses().size() == 40) {
            }
        } else {
            throw new Exception(String.format("The academician %s %s does not have permission!", getName(), getSurname()));
        }

    }

    public void giveGraduateCertificate(GraduateStudent student) throws Exception {
        if (this == getDepartment().getHeadOfDepartment()) {
            if (student.getGPA() >= 2 && student.getTakenCourses().size() >= 7) {
            }
        } else {
            throw new Exception(String.format("The academician %s %s does not have permission!", getName(), getSurname()));
        }

    }
}
