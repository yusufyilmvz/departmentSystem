package staff;

import academic.Academician;
import academic.Student;
import departmentSystem.Department;
import course.Course;

public class StaffSecretary extends Staff {

    public StaffSecretary(String identificationNumber, String name, String surname, Department department, String workingPlace, int workingHours, String taskInformation) {
        super(identificationNumber, name, surname, department, workingPlace, workingHours, taskInformation);
    }

    public void addCourseInstructor(Course course, Academician Instructor) throws Exception {
        if (course.getAcademician() == null){
            course.setAcademician(Instructor);
        }
        else{
            throw new Exception(String.format("The course instructor is available: %s",course.getAcademician().getName()));
        }
    }
    public void uppdateCourseInstructor(Course course,Academician Instructor){
        course.setAcademician(Instructor);
        System.out.printf("The instructor of the  course was %s changed to %s.\n",course.getCourseName(),course.getAcademician().getName());
    }

    public void addStudentToTheCourse(Student student, Course course) throws Exception {
        int tempValue = 0, indexOfCourse = 0;
        for(Course tempCourse : course.getAcademician().getCourses()) {
            if (tempCourse == course) {
                ++tempValue;
                break;
            }
            ++indexOfCourse;
        }
        if (tempValue != 0) {
            int tempValue2 = 0, indexOfStudent = 0;
            for (Student tempStudent : course.getAcademician().getCourses().get(indexOfCourse).getStudents()) {
                if (tempStudent == student) {
                    ++tempValue2;
                    break;
                }
                ++indexOfStudent;
            }
            if (tempValue2 != 0) {
                course.getAcademician().getCourses().get(indexOfCourse).getStudents().add(student);
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
