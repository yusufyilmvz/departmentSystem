package area;

public abstract class Area{
    private String code;

    private int capacity;
    private int weight;
    private int height;

    public Area(String code, int capacity, int weight, int height) {
        this.code = code;
        this.capacity = capacity;
        this.weight = weight;
        this.height = height;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Area{" +
                "code='" + code + '\'' +
                ", capacity=" + capacity +
                '}';
    }
    public int calculateArea()
    {
        System.out.printf("The area of %s is %d square meters",this.code,this.weight*this.height);
        return this.weight*this.height;
    }
    public void isLargerThan(Area area){
        if (this.calculateArea()>area.calculateArea()){
            System.out.printf("The area of %s is larger than %s.",this.code,area.getCode());
        }
        else if(this.calculateArea()>area.calculateArea()){
            System.out.printf("The area of %s is larger than %s.",area.getCode(),this.code);
        }
        else {
            System.out.printf("The area of %s is equal to %s.",this.code,area.getCode());
        }
    }
}
