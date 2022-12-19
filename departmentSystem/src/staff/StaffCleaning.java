package staff;

import academic.Department;
import area.Area;

import java.util.ArrayList;

public class StaffCleaning extends Staff {
    private ArrayList<Area> workingPlace;
    public StaffCleaning(String identificationNumber, String name, String surname, Department department,int workingHours, String taskInformation) {
        super(identificationNumber, name, surname, department,workingHours, taskInformation);
        workingPlace = new ArrayList<Area>();
    }

    public ArrayList<Area> getWorkingPlace() {
        return workingPlace;
    }

    public void cleanedPlace(StaffCleaning cleaner, Area area){
        System.out.printf("The %s was cleaned by %s,the cleaner.",cleaner.getName(),area.getCode());
        }


}
