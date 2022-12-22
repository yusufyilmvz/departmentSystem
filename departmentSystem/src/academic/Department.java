package academic;

import staff.Staff;

import java.util.ArrayList;

// Department class
public class Department {
    // Attributes
    private int departmentId; // ID information of the department
    private String departmentName; // Name of the department
    private Academician headOfDepartment; // The academician who is head of the department
    // These lists can be done for all persons/areas
    private ArrayList<Student> studentsInDepartment; // Students in the department
    private ArrayList<Staff> staffsInDepartment; // Staffs in the department

    // Constructors
    public Department(int departmentId, String departmentName, Academician headOfDepartment) {
        studentsInDepartment = new ArrayList<Student>();
        staffsInDepartment = new ArrayList<Staff>();
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.headOfDepartment = headOfDepartment;
    }

    public Department(int departmentId, String departmentName) {
        studentsInDepartment = new ArrayList<Student>();
        staffsInDepartment = new ArrayList<Staff>();
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    // Methods

    // Shows students in the department
    public void showStudentsInDepartment() {
        for (Student student : studentsInDepartment) {
            System.out.println(student);
        }
    }

    // Shows staffs in the department
    public void showStaffsInDepartment() {
        for (Staff staff : staffsInDepartment) {
            System.out.println(staff);
        }
    }

    // Getters-setters

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Academician getHeadOfDepartment() {
        return headOfDepartment;
    }

    public void setHeadOfDepartment(Academician headOfDepartment) {
        this.headOfDepartment = headOfDepartment;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    protected void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public ArrayList<Student> getStudentsInDepartment() {
        return studentsInDepartment;
    }

    public ArrayList<Staff> getStaffsInDepartment() {
        return staffsInDepartment;
    }
}
