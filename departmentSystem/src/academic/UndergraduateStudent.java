package academic;

public class UndergraduateStudent extends Student{

    // Obligatory constructor
    public UndergraduateStudent(String identificationNumber, String name, String surname, String idNumber, int year) {
        super(identificationNumber, name, surname, idNumber, year);
    }

    public UndergraduateStudent(String identificationNumber, String name, String surname, Department department, String idNumber, int year) {
        super(identificationNumber, name, surname, department, idNumber, year);
    }

    @Override
    public String toString(){
        return super.toString() + String.format("");
    }
}
