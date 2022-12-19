package staff;

import academic.Department;
import area.Area;

import java.util.ArrayList;

public class StaffTechnical extends Staff {
    private ArrayList<Area> workingPlace;
    public StaffTechnical(String identificationNumber, String name, String surname, Department department, int workingHours, String taskInformation) {
        super(identificationNumber, name, surname, department, workingHours, taskInformation);
        workingPlace = new ArrayList<Area>();
    }
    //Getter-Setter methods

    public ArrayList<Area> getWorkingPlace() {
        return workingPlace;
    }

    /*
    * ArizaVar
    * ArizaTamirEdildi
    */
}
