package staff;

import departmentSystem.Department;

public class StaffSecurity extends Staff {

    public StaffSecurity(String identificationNumber, String name, String surname, Department department, String workingPlace, int workingHours) {
        super(identificationNumber, name, surname, department, workingPlace,workingHours);
    }
}
