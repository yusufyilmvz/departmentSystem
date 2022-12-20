package staff;

import academic.Department;
import academic.Person;
import area.Area;
import area.AreaEntry;

import java.util.ArrayList;

public class StaffSecurity extends Staff {
    public StaffSecurity(String identificationNumber, String name, String surname, Department department, int workingHours, String taskInformation) {
        super(identificationNumber, name, surname, department, workingHours, taskInformation);
    }

    public void personEntried(Person person, AreaEntry entry)throws Exception{
        if (!this.getWorkingPlaces().contains(entry)) {
            throw new Exception(String.format("The area %s is not allowed for %s %s", entry.getCode(), this.getName(), this.getSurname()));
        } else {
            System.out.printf("The %s %s entered through %s",person.getName(),person.getSurname(), entry.getCode());
        }
    }
    public void personOuted(Person person,AreaEntry entry) throws Exception{
        if (!this.getWorkingPlaces().contains(entry)) {
            throw new Exception(String.format("The area %s is not allowed for %s %s", entry.getCode(), this.getName(), this.getSurname()));
        } else {
            System.out.printf("The %s %s exited from %s",person.getName(),person.getSurname(), entry.getCode());
        }
    }
    public void checkedArea(Area area)throws Exception{
        if (!this.getWorkingPlaces().contains(area)) {
            throw new Exception(String.format("The area %s is not allowed for %s %s", area.getCode(), this.getName(), this.getSurname()));
        } else {
            System.out.printf("The %s was checked by %s,the guard.", this.getName(), area.getCode());
        }
    }
}
