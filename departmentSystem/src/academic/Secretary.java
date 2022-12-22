package academic;

import area.Area;
import area.AreaAmphi;
import staff.Staff;

// Secretary class extends Staff class
public class Secretary extends Staff {
    // Constructors
    public Secretary(String identificationNumber, String name, String surname, Department department, int workingHours, String taskInformation) {
        super(identificationNumber, name, surname, department,  workingHours, taskInformation);
    }

    public Secretary(String identificationNumber, String name, String surname, Department department) {
        super(identificationNumber, name, surname, department);
    }

    // Methods
    // Updates instructor of the course
    public void updateCourseInstructor(Course course, Academician instructor) throws Exception {
        if (course.getAcademician() == null) {
            throw new Exception(String.format("The course called %s does not have any instructor", course.getCourseName()));
        }
        if (course.getAcademician() == instructor) {
            throw new Exception(String.format("The instructor %s %s is already the lecturer of the course called %s", instructor.getName(), instructor.getSurname(), course.getCourseName()));
        } else {
            course.getAcademician().getCourses().remove(course);
            course.setAcademician(instructor);
            System.out.printf("The instructor of the  course was %s changed to %s.\n", course.getCourseName(), course.getAcademician().getName());
        }
    }

    // Adds undergraduate student to the undergraduate course
    public void addUndergraduateStudentToTheCourse(UndergraduateStudent student, UndergraduateCourse course) throws Exception {
        if (student.isFinished()) {
            throw new Exception(String.format("Course adding error: the student who is %s %s graduated", student.getName(), student.getSurname()));
        } else {
            int controller = 0;
            for (CourseInformation tempCourseInformation : student.getTakenCourses()) {
                if (tempCourseInformation.getCourse() == course) {
                    ++controller;
                    break;
                }
            }
            if (controller != 1) {
                CourseInformation courseInformation = new CourseInformation(course);
                student.getTakenCourses().add(courseInformation);
                course.getStudents().add(student);
            } else {
                throw new Exception(String.format("%s %s have already taken the course called %s", student.getName(), student.getSurname(), course.getCourseName()));
            }
        }

    }

    // Adds graduate student to the graduate course
    public void addGraduateStudentToTheCourse(GraduateStudent student, GraduateCourse course) throws Exception {
        if (student.isFinished()) {
            throw new Exception(String.format("Course adding error: the student who is %s %s graduated", student.getName(), student.getSurname()));
        } else {
            int controller = 0;
            for (CourseInformation tempCourseInformation : student.getTakenCourses()) {
                if (tempCourseInformation.getCourse() == course) {
                    ++controller;
                    break;
                }
            }
            if (controller != 1) {
                CourseInformation courseInformation = new CourseInformation(course);
                student.getTakenCourses().add(courseInformation);
                course.getStudents().add(student);
            } else {
                throw new Exception(String.format("%s %s have already taken the course called %s", student.getName(), student.getSurname(), course.getCourseName()));
            }
        }

    }

    // Obligatory part
    // if number of the courses that attended to academician are more than 10, it throws an execption. Otherwise, it adds course to academician
    // Adds course to the academician
    public void addCourseToAcademician(Course course, Academician academician) throws Exception {
        if (course.getAcademician() == null) {
            if (academician.getCourses().size() >= 10) {
                throw new Exception(String.format("The lecturer %s %s who has \"%s\" id number access to max course number(10) !", academician.getName(), academician.getSurname(), academician.getIdentificationNumber()));
            } else {
                int controller = 0;
                for (Course tempCourse : academician.getCourses()) {
                    if (tempCourse == course) {
                        ++controller;
                    }
                }
                if (controller != 1) {
                    academician.getCourses().add(course);
                    course.setAcademician(academician);
                } else {
                    throw new Exception(String.format("The academician %s %s already has the course called %s !", getName(), getSurname(), course.getCourseName()));
                }

            }
        } else {
            throw new Exception(String.format("The course called %s has already an instructor: %s %s", course.getCourseName(), course.getAcademician().getName(), course.getAcademician().getSurname()));
        }
    }

    // Sets department to the student
    public void setDepartmentToStudent(Student student, Department department) throws Exception{
        if (student.isFinished()) {
            throw new Exception(String.format("Department setting error: the student who is %s %s graduated", student.getName(), student.getSurname()));
        } else {
            if (student.getDepartment() != null) {
                throw new Exception(String.format("The student who is %s %s has already a department", getName(), getSurname()));
            } else {
                student.setDepartment(department);
                department.getStudentsInDepartment().add(student);
            }
        }

    }

    // Updates department of the student
    public void updateDepartmentOfStudent(Student student, Department department) throws Exception {
        if (student.isFinished()) {
            throw new Exception(String.format("Department updating error: the student who is %s %s graduated", student.getName(), student.getSurname()));
        } else {
            if (student.getDepartment() != null) {
                student.getDepartment().getStudentsInDepartment().remove(student);
                student.setDepartment(department);
                department.getStudentsInDepartment().add(student);
            } else {
                throw new Exception(String.format("The student who is %s %s was not entered any department", getName(), getSurname()));
            }
        }

    }

    // Sets head of department to deparment
    public void setHeadOfDepartment(Department department, Academician academician) throws Exception{
        if (department.getHeadOfDepartment() != null) {
            throw new Exception(String.format("The department called %s has already a head academician: %s %s", department.getDepartmentName(), academician.getName(), academician.getSurname()));
        } else if (!(academician instanceof Proffesor)) {
            throw new Exception(String.format("The academician %s %s has not sufficient degree for department %s", academician.getName(), academician.getSurname(), department.getDepartmentName()));
        } else {
            department.setHeadOfDepartment(academician);
        }
    }

    // Updates head of department of the department
    public void updateHeadOfDepartment(Department department, Academician academician) throws Exception{
        if (department.getHeadOfDepartment() == null) {
            throw new Exception(String.format("The department called %s has no head academician: %s %s", department.getDepartmentName(), academician.getName(), academician.getSurname()));
        } else if (!(academician instanceof Proffesor)) {
            throw new Exception(String.format("The academician %s %s has not suffcient degree for department %s", academician.getName(), academician.getSurname(), department.getDepartmentName()));
        } else {
            department.setHeadOfDepartment(academician);
        }
    }

    // Adds working place to the staff
    public void addWorkingPlaceToStaff(Staff staff, Area area) throws Exception{
        if (!staff.getWorkingPlaces().contains(area)) {
            staff.getWorkingPlaces().add(area);
            System.out.println("Addition of working place is successful");
        } else {
            throw new Exception(String.format("The staff %s %s has already %s working place", staff.getName(), staff.getSurname(), area.getCode()));
        }
    }

    // Adds amphi to the course
    public void addAmphiToCourse(Course course, AreaAmphi amphi) throws Exception{
        if (course.getClassLessonGiven() == null) {
            course.setClassLessonGiven(amphi);
        } else {
            throw new Exception(String.format("Additin fail: The course %s has already an amphi", course.getCourseName()));
        }
    }

    // Updates amphi of the courses
    public void updateAmphiOfCourse(Course course, AreaAmphi amphi) throws Exception {
        if (course.getClassLessonGiven() != null) {
            course.setClassLessonGiven(amphi);
        } else {
            throw new Exception(String.format("Update fail: The course %s has no an amphi", course.getCourseName()));
        }
    }

    // Updates current working topic of the research fellow
    public void updateWorkingTopicOfResearchFellow(ResearchFellow researchFellow, String workingTopic) {
        researchFellow.setCurrentResearchTopic(workingTopic);
    }

    // Decides salary amount of the staff
    public void determineSalartOfStaff(Staff staff, double salary) throws Exception{
        if (salary < 8500) {
            throw new Exception("Salary can not be less than minimum wage");
        } else {
            staff.setSalary(salary);
        }
    }
}



