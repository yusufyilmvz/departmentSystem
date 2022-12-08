package academic;

import departmentSystem.Department;

public class UndergraduateStudent extends Student{
    private boolean isGraduated;
    public UndergraduateStudent(String identificationNumber, String name, String surname, Department department, String idNumber, int year) {
        super(identificationNumber, name, surname, department, idNumber, year);
        isGraduated = false;
    }

    public boolean isGraduated() {
        return isGraduated;
    }


}
