package departmentSystem;

import academic.Academician;
import academic.Student;
import course.Course;
import academic.Secretary;

public class Tester {
    public static void main(String[] args) {
        Course mat101 = new Course(123,"MAT101",3);
        Course mat102 = new Course(124,"MAT102",4);
        Course mat103 = new Course(125,"MAT103",5);
        Course mat104 = new Course(126,"MAT104",6);
        Course mat105 = new Course(127,"MAT105",2);
        Course mat106 = new Course(128,"MAT106",4);
        Course mat107 = new Course(128,"MAT106",4);
        Course mat108 = new Course(128,"MAT106",4);
        Course mat109 = new Course(128,"MAT106",4);
        Course mat1010 = new Course(128,"MAT106",4);
        Course mat1011 = new Course(128,"MAT106",4);


        Department computerEngineering = new Department(1, "Computer Engineering");
        Student student = new Student("123456789120", "Yusuf", "Yılmaz", computerEngineering, "201180021", 2020);
        Student student2 = new Student("123456789120", "Ali", "Yılmaz", computerEngineering, "201180021", 2020);
        Student student3 = new Student("123456789120", "Cengiz", "Yılmaz", computerEngineering, "201180021", 2020);
        Student student4 = new Student("123456789120", "Murat", "Yılmaz", computerEngineering, "201180021", 2020);

        Secretary secretary = new Secretary("98765432100", "Ali", "Veli", computerEngineering);
        Academician academician = new Academician("15646460", "Uraz", "Yavan", computerEngineering);
        Academician academician2 = new Academician("15646460", "Ali", "Yavan", computerEngineering);


        try {
//            secretary.addCourseToAcademician(mat101, academician2);
//            secretary.addCourseToAcademician(mat101, academician);

            secretary.addCourseToAcademician(mat101, academician);
            secretary.addStudentToTheCourse(student, mat101);
            secretary.addStudentToTheCourse(student, mat102);
            secretary.addStudentToTheCourse(student, mat103);
            secretary.addStudentToTheCourse(student, mat104);
            secretary.addStudentToTheCourse(student, mat105);
            secretary.addStudentToTheCourse(student, mat106);
//            student.showTakenCourses();


            secretary.addStudentToTheCourse(student2, mat101);
            secretary.addStudentToTheCourse(student3, mat101);
            secretary.addStudentToTheCourse(student4, mat101);

            System.out.println(student.getGPA());
            academician.addGradeToStudent(student, mat101, 90, (float)75.5);
            System.out.println(student.getGPA());
            academician.addGradeToStudent(student, mat102, 95, (float)75.5);
            academician.addGradeToStudent(student, mat103, 40, (float)30.45);
            System.out.println(student.getGPA());

            academician.addGradeToStudent(student4, mat101, 50, 50);
            System.out.println(student4.getGPA());





        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
