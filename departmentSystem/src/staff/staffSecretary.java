package staff;

import academic.Academician;
import departmentSystem.Department;
import departmentSystem.Person;
import course.Course;

public class staffSecretary extends staff {
    public staffSecretary(String identificationNumber, String name, String surname, Department department, String workingPlace,int workingHours) {
        super(identificationNumber, name, surname, department, workingPlace,workingHours);
    }

    public void addCourseInstructor(Course course, Academician Instructor) throws Exception {
        if (course.getAcademician().equals(null)){
            throw new Exception("The course instructor is available");
        }
        else{
            course.setAcademician(Instructor);
        }
    }
    public void uppdateCourseInstructor(Course course,Academician Instructor){
        course.setAcademician(Instructor);
    }
}
