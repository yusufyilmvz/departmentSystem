package course;

import academic.Academician;
import academic.Course;

public class UndergraduateCourse extends Course {
    public UndergraduateCourse(int courseCode, String courseName, int credit, String courseLocation, Academician academician) {
        super(courseCode, courseName, credit, courseLocation, academician);
    }

    public UndergraduateCourse(int courseCode, String courseName, int credit, String courseLocation) {
        super(courseCode, courseName, credit);
    }
}
