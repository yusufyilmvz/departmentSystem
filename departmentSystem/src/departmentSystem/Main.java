package departmentSystem;
import academic.Academician;
import academic.Student;
import course.Course;
import staff.Staff;
import staff.StaffSecretary;

public class Main {

	public static void main(String[] args) {
//		System.out.println("Try 123");
//		System.out.println("Hello OOP");
		Department department = new Department(15, "Ceng");
		Academician academician = new Academician("151515", "Yusuf", "Yılmaz", department);
		Academician academician2 = new Academician("151515", "Ahmet", "Yılmaz", department);
		StaffSecretary sekreter = new StaffSecretary("1234","ali","alt",department,"3.kat",12, "fdfsd");
		Course mat101 = new Course(123,"MAT101",3,"205");
//
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
		sekreter.uppdateCourseInstructor(mat101,academician2);

		try {
			sekreter.addCourseInstructor(mat101,academician);
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
		Student student = new Student("432432", "Ferruh", "Ünsal", department, "3232", 2423 );

	}

}
