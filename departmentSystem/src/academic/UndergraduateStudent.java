package academic;

// Undergraduate course extends Student course
public class UndergraduateStudent extends Student{
    // Constructors
    // Obligatory constructor
    public UndergraduateStudent(String identificationNumber, String name, String surname, String idNumber, int year) {
        super(identificationNumber, name, surname, idNumber, year);
    }

    public UndergraduateStudent(String identificationNumber, String name, String surname, Department department, String idNumber, int year) {
        super(identificationNumber, name, surname, department, idNumber, year);
    }

    // Method(s)
    @Override
    public String toString(){
        return super.toString() + String.format("");
    }
}
