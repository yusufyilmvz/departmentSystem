package academic;

import java.util.ArrayList;

public abstract class Academician extends Person {
    // Attribute(s)
    private ArrayList<Course> courses;


    // Constructor
    public Academician(String identificationNumber, String name, String surname, Department department) {
        super(identificationNumber, name, surname, department);
        courses = new ArrayList<Course>();
    }

    // Methods

    public String toString() {
        return String.format("Identification number: %s\nName: %s\nSurname: %s\nDepartment: %s",
                getIdentificationNumber(), getName(), getSurname(), getDepartment().getDepartmentName());
    }

    // Obligatory method
    public void addGradeToStudent(Student student, Course course, float midtermGrade, float finalGrade) throws Exception {
        if (student.isFinished()) {
            throw new Exception(String.format("Grade adding error: the student who is %s %s graduated", student.getName(), student.getSurname()));
        } else {
            int controlOfCourse = 0, indexOfCourse = 0;
            // Controlling the student has the course or not
            for (CourseInformation tempCourse : student.getTakenCourses()) {
                if (tempCourse.getCourse() == course) {
                    ++controlOfCourse;
                    break;
                }
                ++indexOfCourse;
            }
            // Control part
            if (controlOfCourse != 0) {
                int controller = 0;
                // Controlling the academician is the lecturer of course or not
                for (Course tempCourse : courses) {
                    if (tempCourse == course) {
                        ++controller;
                        break;
                    }
                }
                // Control part
                if (controller != 0) {
                    student.getTakenCourses().get(indexOfCourse).setMidtermGrade(midtermGrade);
                    student.getTakenCourses().get(indexOfCourse).setFinalGrade(finalGrade);
                    student.updateGPA();
                } else {
                    throw new Exception(String.format("The lecturer %s %s is not the lecturer of the lesson called %s !", getName(), getSurname(), course.getCourseName()));
                }

            } else {
                throw new Exception(String.format("%s %s is not registered to the course called %s !", student.getName(), student.getSurname(), course.getCourseName()));
            }
        }

    }


    public void giveUnderGraduateCertificate(UndergraduateStudent student) throws Exception {
        if (student.isFinished()) {
            throw new Exception(String.format("Certificate giving error: the student who is %s %s already graduated", student.getName(), student.getSurname()));
        } else {
            // Controlling the instructor is head of department or not
            if (this == getDepartment().getHeadOfDepartment()) {
                if (student.getGPA() >= 2 && student.getTakenCourses().size() >= 3) {
                    student.assignFinished(true);
                } else {
                    throw new Exception(String.format("The student who is %s %s does not have required conditions.(at least 40 courses and at least 2.0 grade avarage)", student.getName(), student.getSurname()));
                }
            } else {
                throw new Exception(String.format("The academician %s %s does not have permission!", getName(), getSurname()));
            }
        }


    }

    public void giveGraduateCertificate(GraduateStudent student) throws Exception {
        if (student.isFinished()) {
            throw new Exception(String.format("Certificate giving error: the student who is %s %s already graduated", student.getName(), student.getSurname()));
        } else {
            // Controlling the instructor is head of department or not
            if (this == getDepartment().getHeadOfDepartment()) {
                if (student.getDegreeType().equals(DegreeType.MASTER)) {
                    if (student.getGPA() >= 2.5 && student.getTakenCourses().size() >= 7) {
                        student.assignFinished(true);
                    } else {
                        throw new Exception(String.format("The student who is %s %s does not have required conditions.(at least 7 courses and at least 2.5 grade avarage)", student.getName(), student.getSurname()));
                    }
                } else if (student.getDegreeType().equals(DegreeType.DOCTORAL)) {
                    if (student.getGPA() >= 3.0 && student.getTakenCourses().size() >= 8) {
                        student.assignFinished(true);
                    } else {
                        throw new Exception(String.format("The student who is %s %s does not have required conditions.(at least 8 courses and at least 3.0 grade avarage)", student.getName(), student.getSurname()));
                    }
                } else {
                    throw new Exception(String.format("The student who is %s %s does not have degree type!", student.getName(), student.getSurname()));
                }
            } else {
                throw new Exception(String.format("The academician %s %s does not have permission!", getName(), getSurname()));
            }
        }
    }

    public void showGivenCourses() {
        for (Course course : getCourses()) {
            System.out.println(course);
        }
    }

    // Getter(s)
    protected ArrayList<Course> getCourses() {
        return courses;
    }

}
