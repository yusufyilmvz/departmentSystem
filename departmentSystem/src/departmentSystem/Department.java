package departmentSystem;

import academic.Academician;

public class Department {
    // Attributes
    private int departmentId;
    private String departmentName;
    private Academician headOfDepartment;

    // Constructors
    public Department(int departmentId, String departmentName, Academician headOfDepartment) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.headOfDepartment = headOfDepartment;
    }

    public Department(int departmentId, String departmentName) {
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

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
}
