package academic;

import departmentSystem.Department;

public class GraduateStudent extends Student{
    private String degreeType; // master or doctoral etc.
    private String degreeInformation;

    // Constructors
    public GraduateStudent(String identificationNumber, String name, String surname, Department department, String idNumber, int year, String degreeType, String degreeInformation) {
        super(identificationNumber, name, surname, department, idNumber, year);
        this.degreeType = degreeType;
        this.degreeInformation = degreeInformation;
    }

    public GraduateStudent(String identificationNumber, String name, String surname, Department department, String idNumber, int year) {
        super(identificationNumber, name, surname, department, idNumber, year);
    }

    // Getters-setters
    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    public String getDegreeInformation() {
        return degreeInformation;
    }

    public void setDegreeInformation(String degreeInformation) {
        this.degreeInformation = degreeInformation;
    }
}
