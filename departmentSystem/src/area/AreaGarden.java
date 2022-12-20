package area;

import java.util.ArrayList;

public class AreaGarden extends Area{

    private ArrayList<String> plants;
    //Constructor
    public AreaGarden(String code,int capacity,int weight,int height){
        super(code,capacity,weight,height);
        plants = new ArrayList<String>();
    }
    //Getter-Setter Methods
    public ArrayList<String> getPlants() {
        return plants;
    }
}
