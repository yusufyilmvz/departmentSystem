package staff;

import departmentSystem.Department;
import academic.Academician;
import course.Course;

public class StaffCleaning extends Staff {
    public StaffCleaning(String identificationNumber, String name, String surname, Department department, String workingPlace, int workingHours, String taskInformation) {
        super(identificationNumber, name, surname, department, workingPlace, workingHours, taskInformation);
    }
    /*
     *   public void cleanedPlace(StaffCleaning cleaner,working place){
     *      String.out.printf("The %s was cleaned by %s, the cleaner.",workingPlace,cleaner.getName());
     *   }
     */


}
