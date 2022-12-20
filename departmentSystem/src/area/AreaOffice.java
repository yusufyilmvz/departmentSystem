package area;

import academic.Academician;

public class AreaOffice extends Area{

    private Academician academician;

    public AreaOffice(String officeCode,int capacity){
        super(officeCode,capacity);

    }

    //GETTER-SETTER METHODS

    public Academician getAcademician() {
        return academician;
    }

    public void setAcademician(Academician academician) {
        this.academician = academician;
    }
}
