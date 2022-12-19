package area;

public class AreaGarden extends Area{
    private int capacity;
    public AreaGarden(String function,int capacity){
        super(function);
        this.capacity=capacity;
    }
    //Getter-Setter methods

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
