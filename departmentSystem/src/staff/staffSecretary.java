package staff;

import departmentSystem.Department;
import departmentSystem.Person;

public class staffSecretary extends staff {
    public staffSecretary(String identificationNumber, String name, String surname, Department department, String workingPlace,int workingHours) {
        super(identificationNumber, name, surname, department, workingPlace,workingHours);
    }
}
