package area;



public abstract class Area{

    private String code;

    private int capacity;
    public Area(String code,int capacity)
    {

        this.code = code;
        this.capacity = capacity;
    }
    public Area(String code)
    {
        this.code = code;
    }
    //getter-setter methods


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
