package staff;

import academic.Department;
import area.Area;

import java.util.ArrayList;

public class StaffCleaning extends Staff {
    public StaffCleaning(String identificationNumber, String name, String surname, Department department,int workingHours, String taskInformation) {
        super(identificationNumber, name, surname, department,workingHours, taskInformation);
    }

    public void cleanedPlace(Area area) throws Exception {
        if (!this.getWorkingPlaces().contains(area)) {
            throw new Exception(String.format("The area %s is not allowed for %s %s", area.getCode(), this.getName(), this.getSurname()));
        } else {
            System.out.printf("The %s was cleaned by %s,the cleaner.", this.getName(), area.getCode());
        }
    }
}
