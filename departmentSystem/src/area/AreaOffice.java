package area;

import academic.Academician;

public class AreaOffice extends Area{

    private Academician academician;

    public AreaOffice(String officeCode,int capacity,int weight,int height){
        super(officeCode,capacity,weight,height);

    }

    //GETTER-SETTER METHODS

    public Academician getAcademician() {
        return academician;
    }

    public void setAcademician(Academician academician) {
        this.academician = academician;
    }
}
