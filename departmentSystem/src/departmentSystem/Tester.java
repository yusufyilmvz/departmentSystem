package departmentSystem;

import academic.*;

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

        UndergraduateStudent undergraduateStudent1 = new UndergraduateStudent("123456789120", "Cengiz", "Yılmaz", computerEngineering, "201180021", 2020);
        UndergraduateStudent undergraduateStudent2 = new UndergraduateStudent("123456789120", "Murat", "Yılmaz", "201180021", 2020);

        Secretary secretary = new Secretary("98765432100", "Ali", "Veli", computerEngineering);

        Academician academician = new Academician("15646460", "Uraz", "Yavan", computerEngineering);
        Academician academician2 = new Academician("15646460", "Ali", "Yavan", computerEngineering);

        try {
            secretary.setHeadOfDepartment(computerEngineering, academician);

            secretary.addGraduateStudentToTheCourse(graduateStudent1, graduateCourse1);
            secretary.addGraduateStudentToTheCourse(graduateStudent1, graduateCourse2);
            secretary.addGraduateStudentToTheCourse(graduateStudent1, graduateCourse3);

            secretary.addUndergraduateStudentToTheCourse(undergraduateStudent1, undergraduateCourse1);
            secretary.addUndergraduateStudentToTheCourse(undergraduateStudent1, undergraduateCourse2);
            secretary.addUndergraduateStudentToTheCourse(undergraduateStudent1, undergraduateCourse3);
//            undergraduateStudent1.printTakenCoursesWithGrades();

            secretary.addCourseToAcademician(graduateCourse1, academician);
            secretary.addCourseToAcademician(graduateCourse2, academician);
            secretary.addCourseToAcademician(graduateCourse3, academician);

//            academician.showGivenCourses();

            secretary.addCourseToAcademician(undergraduateCourse1, academician2);
            secretary.addCourseToAcademician(undergraduateCourse2, academician2);
            secretary.addCourseToAcademician(undergraduateCourse3, academician2);

            academician2.addGradeToStudent(undergraduateStudent1, undergraduateCourse1, 50, 50);
            academician2.addGradeToStudent(undergraduateStudent1, undergraduateCourse2, 50, 50);
            academician2.addGradeToStudent(undergraduateStudent1, undergraduateCourse3, 50, 50);

            academician.giveUnderGraduateCertificate(undergraduateStudent1);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
