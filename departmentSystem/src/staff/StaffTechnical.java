package staff;

import academic.Department;
import area.Area;


public class StaffTechnical extends Staff {
    // Constructor
    public StaffTechnical(String identificationNumber, String name, String surname, Department department, int workingHours, String taskInformation) {
        super(identificationNumber, name, surname, department, workingHours, taskInformation);
    }

    // Method(s)
    public void fixedArea(Area area) throws Exception{
        if (!this.getWorkingPlaces().contains(area)) {
            throw new Exception(String.format("The area %s is not allowed for %s %s", area.getCode(), this.getName(), this.getSurname()));
        } else {
            System.out.printf("The %s was fixed by %s,the cleaner.", this.getName(), area.getCode());
        }
    }
}
