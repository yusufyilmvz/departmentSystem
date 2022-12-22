package academic;

// GraduateCourse class extends Course class
public class GraduateCourse extends Course{
    // Constructors
    public GraduateCourse(int courseCode, String courseName, int credit, String courseLocation, Academician academician) {
        super(courseCode, courseName, credit, courseLocation, academician);
    }

    public GraduateCourse(int courseCode, String courseName, int credit) {
        super(courseCode, courseName, credit);
    }
}
