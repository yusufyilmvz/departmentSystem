package area;

import academic.Academician;

public class AreaOffice extends Area{

    private Academician academician;

    public AreaOffice(String function,String officeCode,int capacity){
        super(function,officeCode,capacity);

    }

    //GETTER-SETTER METHODS

    public Academician getAcademician() {
        return academician;
    }

    public void setAcademician(Academician academician) {
        this.academician = academician;
    }
}
