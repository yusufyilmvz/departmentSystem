package area;

import academic.Course;

import java.util.ArrayList;

public class AreaAmphi extends Area {

    private ArrayList<Course> takencourses;

    //Constructor
    public AreaAmphi(String function,String amphiCode){
        super(function,amphiCode);
        takencourses = new ArrayList<>();
    }

    public ArrayList<Course> getTakencourses() {
        return takencourses;
    }
    //Methods
    public void addCoursetoAmphi(Course course){
        this.takencourses.add(course);
    }
}
