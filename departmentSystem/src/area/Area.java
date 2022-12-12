package area;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Area {
    private String code;
    private String function;

    public Area(String code,String function)
    {
        this.code = code;
        this.function = function;
    }
    //Getter-Setter methods

    public String getCode() {
        return code;
    }

    public String getFunction() {
        return function;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setFunction(String function) {
        this.function = function;
    }
    //add method
    static public void addArea(Area area){

        LinkedHashSet<Area> Areas= new LinkedHashSet<>();
        LinkedHashSet<Area> Officies = new LinkedHashSet<>();
        LinkedHashSet<Area> Amphies = new LinkedHashSet<>();
        LinkedHashSet<Area> Labs = new LinkedHashSet<>();

        String str = area.function.toUpperCase();

        if (str.equals("AREA")){

            Areas.add(area);
            System.out.println("worked");
        }
        else if(str.equals("OFFİCE")){
            Officies.add(area);
            System.out.println("worked");
        }
        else if(str.equals("AMPHİ")){
            Amphies.add(area);
            System.out.println("worked");
        }
        else if(str.equals("LAB")){
            Labs.add(area);
            System.out.println("worked");
        }
    }

}
