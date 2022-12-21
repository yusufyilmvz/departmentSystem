package academic;
import area.Area;

import java.util.ArrayList;

public abstract class Student extends Person {
    // Attributes
    private String idNumber;
    private int year;
    private float GPA;
    private boolean isFinished;
    private Area where;
    private ArrayList<CourseInformation> takenCourses;

    // Constructors
    // Obligatory constructor - There mustn't null contructor
    public Student(String identificationNumber, String name, String surname, String idNumber, int year) {
        super(identificationNumber, name, surname);
        this.idNumber = idNumber;
        this.year = year;
        takenCourses = new ArrayList<CourseInformation>();
    }

    public Student(String identificationNumber, String name, String surname, Department department, String idNumber, int year) {
        super(identificationNumber, name, surname, department);
        this.idNumber = idNumber;
        this.year = year;
        takenCourses = new ArrayList<CourseInformation>();
        department.getStudentsInDepartment().add(this);
    }

    // Method(s)
    public String toString() {
        return String.format("Identification number: %s\nName: %s\nSurname: %s\nDepartment: %s\nId number: %s\nYear: %d\n",
                getIdentificationNumber(), getName(), getSurname(), getDepartment().getDepartmentName(), getIdNumber(), getYear());
    }

    public void goTo(Area area) {
        this.where = area;
    }

    protected void assignFinished(boolean finished) {
        isFinished = finished;
    }

    protected void updateGPA() {
        float totalGrade = 0;
        int totalCredit = 0;
        for (CourseInformation courseInformation : takenCourses) {
            if (courseInformation.getFinalGrade() != -1 && courseInformation.getMidtermGrade() != -1) {
                totalCredit += courseInformation.getCourse().getCredit();
                totalGrade += (float)((courseInformation.getFinalGrade() * 0.6) + (courseInformation.getMidtermGrade() * 0.4)) * courseInformation.getCourse().getCredit();
            }
        }
        if (totalGrade != 0 && totalCredit != 0) {
            GPA = (totalGrade / totalCredit) / 25;
        } else {
            GPA = 0;
        }
    }

    // Obligatory method
    public boolean isTakeCourse(Course course) {
        for (CourseInformation tempCourse : takenCourses) {
            if (tempCourse.getCourse() == course) {
                return true;
            }
        }
        return false;
    }

    // Obligatory part controlling the course that taken by student has a grade or not!!
    public void printTakenCoursesWithGrades() throws Exception{
        for (CourseInformation courseInformation : getTakenCourses()) {
            if (courseInformation.getCourse() == null) {
                throw new Exception(String.format("Student %s %s has non-existing course", getName(), getSurname()));
            }
            else if (courseInformation.getMidtermGrade() == -1 || courseInformation.getFinalGrade() == -1) {
                throw new Exception(String.format("Some courses that is taken by %s %s have not grade(s)", getName(), getSurname()));
            } else {
                System.out.printf("\n%s: midterm: %.2f final: %.2f\n", courseInformation.getCourse().getCourseCode(), courseInformation.getMidtermGrade(), courseInformation.getFinalGrade());
            }
        }
    }
    // Getters
    // Obligatory part
    // There is no setters because it is read-only

    public String getIdNumber() {
        return idNumber;
    }

    public int getYear() {
        return year;
    }

    public float getGPA() {
        return GPA;
    }

    public Area getWhere() {
        return where;
    }

    protected ArrayList<CourseInformation> getTakenCourses() {
        return takenCourses;
    }

    // For finishing degree
    public boolean isFinished() {
        return isFinished;
    }

}
