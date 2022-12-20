package departmentSystem;

import academic.Department;
import academic.Secretary;
import area.Area;
import area.AreaOffice;
import staff.StaffCleaning;

public class Main {

	public static void main(String[] args) {
		Department computerEngineering = new Department(1, "Computer Engineering");
		Secretary secretary = new Secretary("98765432100", "Ali", "Veli",computerEngineering);

		StaffCleaning cleaner1 = new StaffCleaning("123456","ali","veli",computerEngineering,120,"temizlik");
		Area are1 = new AreaOffice("123",4);
		try {
			secretary.addWorkingPlaceToStaff(cleaner1, are1);
			secretary.addWorkingPlaceToStaff(cleaner1, are1);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}