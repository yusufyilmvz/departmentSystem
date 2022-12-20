package departmentSystem;

import academic.Department;
import academic.Secretary;
import area.Area;
import area.AreaOffice;
import staff.Staff;
import staff.StaffCleaning;

public class Main {

	public static void main(String[] args) {
		Department computerEngineering = new Department(1, "Computer Engineering");
		Secretary secretary = new Secretary("98765432100", "Ali", "Veli",computerEngineering);

		StaffCleaning cleaner1 = new StaffCleaning("123456","ali","veli",computerEngineering,120,"temizlik");
		Area are1 = new AreaOffice("office","123",4);
		secretary.addWorkingPacetoStaffCleaning(cleaner1,are1);

	}
}