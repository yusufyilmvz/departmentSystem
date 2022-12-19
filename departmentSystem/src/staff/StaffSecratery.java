package staff;

import academic.Department;
import area.Area;
import area.AreaOffice;

public class StaffSecratery extends Staff {
    private AreaOffice office;
    public StaffSecratery(String identificationNumber, String name, String surname, Department department, int workingHours, String taskInformation, AreaOffice office){
        super(identificationNumber, name, surname, department,workingHours, taskInformation);
        this.office = office;
    }
    //Getter-Setter Methods

    public AreaOffice getOffice() {
        return office;
    }

    public void setOffice(AreaOffice office) {
        this.office = office;
    }
    /*Methods*/
    //add working place to cleaner.
    void addWorkingPacetoStaffCleaning(StaffCleaning cleaner, Area area){
        cleaner.getWorkingPlace().add(area);
    }
    //add working place to security guard
    void addWorkingPlacetoStaffCleaning(StaffSecurity guard,Area area){
        guard.getWorkingPlace().add(area);
    }
}
