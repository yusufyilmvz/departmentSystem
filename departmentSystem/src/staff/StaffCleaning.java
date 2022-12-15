package staff;

import academic.Department;
import area.Area;

public class StaffCleaning extends Staff {
    public StaffCleaning(String identificationNumber, String name, String surname, Department department, String workingPlace, int workingHours, String taskInformation) {
        super(identificationNumber, name, surname, department, workingPlace, workingHours, taskInformation);
    }
    public void cleanedPlace(StaffCleaning cleaner, Area area){
        System.out.printf("The %s was cleaned by %s,the cleaner.",cleaner.getName(),area.getCode());
        }


}
