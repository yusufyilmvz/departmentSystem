package area;



public abstract class Area{
    private String function;
    private String code;

    private int capacity;
    public Area(String function,String code,int capacity)
    {
        this.function = function;
        this.code = code;
        this.capacity = capacity;
    }
    public Area(String function,int capacity)
    {
        this.function = function;
        this.capacity = capacity;
    }
    //getter-setter methods

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

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
