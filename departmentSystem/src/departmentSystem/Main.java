package departmentSystem;

import academic.Department;
import academic.Secretary;
import area.Area;
import area.AreaAmphi;
import area.AreaOffice;
import staff.Staff;
import staff.StaffCleaning;
import staff.StaffSecurity;
import staff.StaffTechnical;

public class Main {

	public static void main(String[] args) {
		Department computerEngineering = new Department(1, "Computer Engineering");
		Secretary secretary = new Secretary("98765432100", "Ali", "Veli",computerEngineering);


		StaffCleaning cleaner1 = new StaffCleaning("123456","ali","veli",computerEngineering,120,"cleaner");
		StaffCleaning cleaner2 = new StaffCleaning("123456","yusuf","ferruh",computerEngineering,120,"cleaner");

		StaffSecurity guard = new StaffSecurity("123456","ali","veli",computerEngineering,110,"security");
		StaffSecurity guard2 = new StaffSecurity("123456","sali","termiz",computerEngineering,110,"security");

		StaffTechnical tecnhicer = new StaffTechnical("123456","ali","veli",computerEngineering,110,"technical");
		StaffTechnical tecnhicer2 = new StaffTechnical("123456","pınar","veli",computerEngineering,110,"technical");



		
		try {
			//secretary.addWorkingPlaceToStaff(cleaner1, are1);
			//secretary.addWorkingPlaceToStaff(cleaner1, are1);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}