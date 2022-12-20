package staff;

import academic.Department;
import area.Area;
import area.AreaGarden;

public class StaffGarden extends Staff {
    public StaffGarden(String identificationNumber, String name, String surname, Department department, int workingHours, String taskInformation) {
        super(identificationNumber, name, surname, department, workingHours, taskInformation);
    }
    public void addPlants(AreaGarden area,String plant) throws Exception{
        if (!this.getWorkingPlaces().contains(area)) {
            throw new Exception(String.format("The area %s is not allowed for %s %s", area.getCode(), this.getName(), this.getSurname()));
        } else {
            area.getPlants().add(plant);
            System.out.printf("The %s added by %s,the cleaner,in %s.", plant,this.getName(),area.getCode());
        }
    }

}
