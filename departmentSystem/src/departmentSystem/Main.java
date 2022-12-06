package departmentSystem;
import academic.Academician;
import course.Course;
import staff.Staff;
import staff.StaffSecretary;

public class Main {

	public static void main(String[] args) {
//		System.out.println("Try 123");
//		System.out.println("Hello OOP");
		Academician academician = new Academician("151515", "Yusuf", "Yılmaz", Department.COMPUTERENGINEERING);
		Academician academician2 = new Academician("151515", "Ahmet", "Yılmaz", Department.COMPUTERENGINEERING);
		StaffSecretary sekreter = new StaffSecretary("1234","ali","alt",Department.COMPUTERENGINEERING,"3.kat",12);
		Course mat101 = new Course(123,"MAT101",3,"205");

		try {
			sekreter.addCourseInstructor(mat101,academician);
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
		try {
			sekreter.addCourseInstructor(mat101,academician2);
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

}
