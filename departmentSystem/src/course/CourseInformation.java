package course;

import academic.Course;

public class CourseInformation {
    // Variables
    private Course course;
    private float midtermGrade;
    private float finalGrade;

    // Constructor

    public CourseInformation(Course course) {
        this.course = course;
        midtermGrade = -1;
        finalGrade = -1;
    }

    // Getter-setters
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public float getMidtermGrade() {
        return midtermGrade;
    }

    public void setMidtermGrade(float midtermGrade) {
        this.midtermGrade = midtermGrade;
    }

    public float getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(float finalGrade) {
        this.finalGrade = finalGrade;
    }
}
