package academic;

public class UndergraduateCourse extends Course{
    // Constructors
    public UndergraduateCourse(int courseCode, String courseName, int credit, String courseLocation, Academician academician) {
        super(courseCode, courseName, credit, courseLocation, academician);
    }

    public UndergraduateCourse(int courseCode, String courseName, int credit) {
        super(courseCode, courseName, credit);
    }
}
