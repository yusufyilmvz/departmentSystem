package academic;

import area.AreaAmphi;

import java.util.ArrayList;

// Course abstract class
public abstract class Course {
    // Attributes
    private int courseCode; // Code of the course
    private String courseName; // Name of the course
    private int credit; // Credit amount of the course
    private String courseLocation; // Location of the course
    private Academician academician; // the academician who gives this course
    private AreaAmphi classLessonGiven; // the amphi where the lesson is taught
    private ArrayList<Student> students; // students who are taken the course

    // Constructors
    public Course(int courseCode, String courseName, int credit, String courseLocation, Academician academician) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credit = credit;
        this.courseLocation = courseLocation;
        this.academician = academician;
        students = new ArrayList<Student>();
    }

    // Obligatory constructor
    public Course(int courseCode, String courseName, int credit) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credit = credit;
        students = new ArrayList<Student>();
    }

    // Methods
    public String toString() {
        if (academician == null) {
            return String.format("Course code: %d\tCourse name: %s\tCredit: %d\tCourse Location: %s\tLecturer: %s",
                    getCourseCode(), getCourseName(), getCredit(), getCourseLocation(), '-');
        }
        return String.format("Course code: %d\tCourse name: %s\tCredit: %d\tCourse Location: %s\tLecturer: %s %s",
                            getCourseCode(), getCourseName(), getCredit(), getCourseLocation(), getAcademician().getName(), getAcademician().getSurname());
    }

    // Shows students who taken the current course
    public void showStudents() {
        for (Student student : students) {
            System.out.printf("\n%s\n", student.getIdNumber());
        }
    }

    // Shows academican of the course
    public void showAcademicianOfCourse() throws Exception{
        if (academician != null) {
            System.out.println(academician);
        } else {
            throw new Exception(String.format("The course what has %s course code does not contain academician", getCourseCode()));
        }
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

    public AreaAmphi getClassLessonGiven() {
        return classLessonGiven;
    }

    protected void setClassLessonGiven(AreaAmphi classLessonGiven) {
        this.classLessonGiven = classLessonGiven;
    }

    // Obligatory part the list is protected, so in the main function course can not add to the student list
    protected ArrayList<Student> getStudents() {
        return students;
    }

}
