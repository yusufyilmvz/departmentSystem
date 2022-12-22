package area;

import academic.Academician;

// AreaOffice class extends Area clas
public class AreaOffice extends Area{
    // Attribute
    private Academician academician;

    // Constructor
    public AreaOffice(String officeCode,int capacity,int weight,int height){
        super(officeCode,capacity,weight,height);

    }

    // Getter(s) - setter(s)
    public Academician getAcademician() {
        return academician;
    }

    public void setAcademician(Academician academician) {
        this.academician = academician;
    }
}
