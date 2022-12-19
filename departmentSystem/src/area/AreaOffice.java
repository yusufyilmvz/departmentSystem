package area;

import academic.Academician;

public class AreaOffice extends Area{

    private Academician academician;

    public AreaOffice(String function,String officeCode,Academician academician,int capacity){
        super(function,officeCode,capacity);
        this.academician = academician;
    }

    //GETTER-SETTER METHODS

    public Academician getAcademician() {
        return academician;
    }

    public void setAcademician(Academician academician) {
        this.academician = academician;
    }
}
