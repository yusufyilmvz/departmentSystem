package academic;

public class GraduateCourse extends Course{
    public GraduateCourse(int courseCode, String courseName, int credit, String courseLocation, Academician academician) {
        super(courseCode, courseName, credit, courseLocation, academician);
    }

    public GraduateCourse(int courseCode, String courseName, int credit) {
        super(courseCode, courseName, credit);
    }

    @Override
    public String toString(){
        return super.toString() + String.format("");
    }
}
