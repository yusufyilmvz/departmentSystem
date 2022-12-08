package staff;

import academic.Academician;
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
}
