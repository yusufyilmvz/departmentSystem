package course;
import academic.Academician;

import java.util.ArrayList;

public class Course {
    private int courseCode;
    private String courseName;
    private int credit;
    private String courseLocation;
    private Academician academician;
    private ArrayList<String> idOfTheStudents;

    public Course(int courseCode, String courseName, int credit, String courseLocation, Academician academician) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credit = credit;
        this.courseLocation = courseLocation;
        this.academician = academician;
        idOfTheStudents = new ArrayList<String>();
    }

    public Course(int courseCode, String courseName, int credit, String courseLocation) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credit = credit;
        idOfTheStudents = new ArrayList<String>();
    }


    // Getter-setters
    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getCourseLocation() {
        return courseLocation;
    }

    public void setCourseLocation(String courseLocation) {
        this.courseLocation = courseLocation;
    }

    public Academician getAcademician() {
        return academician;
    }

    public void setAcademician(Academician academician) {
        this.academician = academician;
    }


}
