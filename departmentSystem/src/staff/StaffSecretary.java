package staff;

import academic.Academician;
import academic.Student;
import course.CourseInformation;
import departmentSystem.Department;
import course.Course;

public class StaffSecretary extends Staff {

    public StaffSecretary(String identificationNumber, String name, String surname, Department department, String workingPlace, int workingHours, String taskInformation) {
        super(identificationNumber, name, surname, department, workingPlace, workingHours, taskInformation);
    }

    public StaffSecretary(String identificationNumber, String name, String surname, Department department) {
        super(identificationNumber, name, surname, department);
    }

    public void uppdateCourseInstructor(Course course, Academician Instructor) throws Exception { // ferruh bunlara if koşulu ekledim kursun hocası yoksa güncellenemez gibi
        if (course.getAcademician() == null) {
            throw new Exception(String.format("The course called %s does not have any instructor", course.getCourseName()));
        }
        course.setAcademician(Instructor);
        System.out.printf("The instructor of the  course was %s changed to %s.\n", course.getCourseName(), course.getAcademician().getName());
    }

    public void addStudentToTheCourse(Student student, Course course) throws Exception {
        int controller = 0;
        for (CourseInformation tempCourseInformation : student.getTakenCourses()) {
            if (tempCourseInformation.getCourse() == course) {
                ++controller;
                break;
            }
        }
        if (controller != 1) {
            CourseInformation courseInformation = new CourseInformation(course);
            student.getTakenCourses().add(courseInformation);
            course.getStudents().add(student);
        } else {
            throw new Exception(String.format("%s %s have already taken the course called %s", student.getName(), student.getSurname(), course.getCourseName()));
        }
    }

    // if number of the courses that attended to academician are more than 10, it throws an execption. Otherwise, it adds course to academician
    public void addCourseToAcademician(Course course, Academician academician) throws Exception {
        if (course.getAcademician() == null) {
            if (academician.getCourses().size() >= 10) {
                throw new Exception(String.format("The lecturer %s %s who has \"%s\" id number access to max course number(10) !", academician.getName(), academician.getSurname(), academician.getIdentificationNumber()));
            } else {
                int controller = 0;
                for (Course tempCourse : academician.getCourses()) {
                    if (tempCourse == course) {
                        ++controller;
                    }
                }
                if (controller != 1) {
                    academician.getCourses().add(course);
                    course.setAcademician(academician);
                } else {
                    throw new Exception(String.format("The academician %s %s already has the course called %s !", getName(), getSurname(), course.getCourseName()));
                }

            }
        } else {
            throw new Exception(String.format("The course called %s has already an instructor: %s %s", course.getCourseName(), course.getAcademician().getName(), course.getAcademician().getSurname()));
        }
    }

}



