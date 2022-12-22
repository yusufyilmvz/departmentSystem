package academic;

// CourseInformation contains course reference and student grades of the course
public class CourseInformation {
    // Attributes
    private Course course; // Current course that can be graded
    private float midtermGrade; // Midterm grade of the student who is taken the course
    private float finalGrade; // Final grade of the student who is taken the course

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
