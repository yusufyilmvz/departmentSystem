package academic;

// GraduateStudent class extends Student class
public class GraduateStudent extends Student{
    private DegreeType degreeType; // master or doctoral etc.
    private String researchSubject;

    // Constructors
    public GraduateStudent(String identificationNumber, String name, String surname, Department department, String idNumber, int year, DegreeType degreeType, String researchSubject) {
        super(identificationNumber, name, surname, department, idNumber, year);
        this.degreeType = degreeType;
        this.researchSubject = researchSubject;
    }

    public GraduateStudent(String identificationNumber, String name, String surname, Department department, String idNumber, int year) {
        super(identificationNumber, name, surname, department, idNumber, year);
    }

    // Obligatory part
    public GraduateStudent(String identificationNumber, String name, String surname, String idNumber, int year) {
        super(identificationNumber, name, surname, idNumber, year);
    }

    // Methods
    public String toString() {
        return super.toString() + String.format("Degree type: %s\nResearch subject: %s\n", getDegreeType(), getResearchSubject());
    }

    // Getters-setters

    public String getResearchSubject() {
        return researchSubject;
    }

    public void setResearchSubject(String researchSubject) {
        this.researchSubject = researchSubject;
    }

    public DegreeType getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(DegreeType degreeType) {
        this.degreeType = degreeType;
    }

}
