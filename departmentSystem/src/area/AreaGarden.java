package area;

import java.util.ArrayList;

public class AreaGarden extends Area{
    // Attribute(s)
    private ArrayList<String> plants;
    //Constructor
    public AreaGarden(String code,int capacity,int weight,int height){
        super(code,capacity,weight,height);
        plants = new ArrayList<String>();
    }
    // Getter(s)
    public ArrayList<String> getPlants() {
        return plants;
    }
}
