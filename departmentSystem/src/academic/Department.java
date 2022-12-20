package academic;

import staff.Staff;

import java.util.ArrayList;

public class Department {
    // Attributes
    private int departmentId;
    private String departmentName;
    private Academician headOfDepartment;
    private ArrayList<Student> studentsInDepartment;
    private ArrayList<Staff> staffsInDepartment;

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
