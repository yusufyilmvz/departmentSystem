package departmentSystem;

import academic.*;
import staff.StaffCleaning;
import staff.StaffGarden;
import staff.StaffSecurity;
import staff.StaffTechnical;

public class Tester {
    public static void main(String[] args) {
        UndergraduateCourse undergraduateCourse1 = new UndergraduateCourse(123,"MAT101",3);
        UndergraduateCourse undergraduateCourse2 = new UndergraduateCourse(124,"MAT102",4);
        UndergraduateCourse undergraduateCourse3 = new UndergraduateCourse(125,"MAT103",5);

        GraduateCourse graduateCourse1 = new GraduateCourse(128,"MAT106",4);
        GraduateCourse graduateCourse2 = new GraduateCourse(129,"MAT106",4);
        GraduateCourse graduateCourse3 = new GraduateCourse(130,"MAT106",4);

        Department computerEngineering = new Department(1, "Computer Engineering");

        GraduateStudent graduateStudent1 = new GraduateStudent("123456789120", "Yusuf", "Yılmaz", computerEngineering, "201180021", 2020);
        GraduateStudent graduateStudent2 = new GraduateStudent("123456789120", "Ali", "Yılmaz", computerEngineering, "201180021", 2020);

        UndergraduateStudent undergraduateStudent1 = new UndergraduateStudent("1234567", "Cengiz", "Yılmaz", computerEngineering, "2011800", 2020);
        UndergraduateStudent undergraduateStudent2 = new UndergraduateStudent("123456789120", "Murat", "Yılmaz", "201180021", 2020);

        Secretary secretary = new Secretary("98765432100", "Ali", "Veli", computerEngineering);

        Academician academician = new Proffesor("15646460", "Uraz", "Yavanoğlu", computerEngineering);
        Academician academician2 = new Instructor("15646460", "Ali", "Yavan", computerEngineering);

        StaffGarden staffGarden = new StaffGarden("5161551", "Ali", "yıldız", computerEngineering, 15, "Plant something");
        StaffCleaning staffCleaning = new StaffCleaning("5161551", "Ali", "yıldız", computerEngineering, 15, "Clean something");
        StaffSecurity staffSecurity = new StaffSecurity("5161551", "Ali", "yıldız", computerEngineering, 15, "Guard somewhere");
        StaffTechnical staffTechnical = new StaffTechnical("5161551", "Ali", "yıldız", computerEngineering, 15, "Repair somewhere");

        try {
            secretary.setHeadOfDepartment(computerEngineering, academician);


            secretary.addGraduateStudentToTheCourse(graduateStudent1, graduateCourse1);
            secretary.addGraduateStudentToTheCourse(graduateStudent1, graduateCourse2);
            secretary.addGraduateStudentToTheCourse(graduateStudent1, graduateCourse3);

            secretary.addUndergraduateStudentToTheCourse(undergraduateStudent1, undergraduateCourse1);
            secretary.addUndergraduateStudentToTheCourse(undergraduateStudent1, undergraduateCourse2);
            secretary.addUndergraduateStudentToTheCourse(undergraduateStudent1, undergraduateCourse3);

            secretary.addUndergraduateStudentToTheCourse(undergraduateStudent2, undergraduateCourse1);
//            undergraduateStudent1.printTakenCoursesWithGrades();
//
            secretary.addCourseToAcademician(graduateCourse1, academician);
            secretary.addCourseToAcademician(graduateCourse2, academician);
            secretary.addCourseToAcademician(graduateCourse3, academician);

            academician.showGivenCourses();

            secretary.addCourseToAcademician(undergraduateCourse1, academician2);
            secretary.addCourseToAcademician(undergraduateCourse2, academician2);
            secretary.addCourseToAcademician(undergraduateCourse3, academician2);
//
            academician2.addGradeToStudent(undergraduateStudent1, undergraduateCourse1, 50, 50);
            academician2.addGradeToStudent(undergraduateStudent1, undergraduateCourse2, 70, 70);
            academician2.addGradeToStudent(undergraduateStudent1, undergraduateCourse3, 90, 90);
            undergraduateStudent1.printTakenCoursesWithGrades();
            System.out.println(undergraduateStudent1.getGPA());

            System.out.println("*******************************");
            undergraduateCourse1.showStudents();

//
//            academician.giveUnderGraduateCertificate(undergraduateStudent1);
//            secretary.addUndergraduateStudentToTheCourse(undergraduateStudent1, undergraduateCourse1);
            computerEngineering.showStudentsInDepartment();


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
