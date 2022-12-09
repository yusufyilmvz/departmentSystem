package course;

import academic.Academician;
import academic.Course;

public class GraduateCourse extends Course {
    public GraduateCourse(int courseCode, String courseName, int credit, String courseLocation, Academician academician) {
        super(courseCode, courseName, credit, courseLocation, academician);
    }

    public GraduateCourse(int courseCode, String courseName, int credit, String courseLocation) {
        super(courseCode, courseName, credit);
    }
}
