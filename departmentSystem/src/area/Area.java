package area;

// Area abstract class
public abstract class Area{
    // Attributes
    private String code; // Code information of the area
    private int capacity; // Capacity of the area
    private int weight; // Weight information of the area
    private int height; // Height information of the area

    // Constructors
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

    // Methods
    @Override
    public String toString() {
        return "Area{" +
                "code='" + code + '\'' +
                ", capacity=" + capacity +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }


    // Calculates total area of the area
    public int calculateArea()throws Exception {
        if (this.getWeight() == 0 || this.getHeight() == 0){
            throw new Exception(String.format("There cannot be any area in %s",this.getCode()));
        }
        System.out.printf("The area of %s is %d square meters",this.getCode(),this.getWeight()*this.getHeight());
        return this.getWeight()*this.getHeight();
    }

    // Compares the areas in terms of area size
    public void isLargerThan(Area area)throws Exception{
        if (this.calculateArea() != 0 && area.calculateArea() != 0){
            if (this.calculateArea()>area.calculateArea()){
                System.out.printf("The area of %s is larger than %s.",this.getCode(),area.getCode());
            }
            else if(this.calculateArea()>area.calculateArea()){
                System.out.printf("The area of %s is larger than %s.",area.getCode(),this.getCode());
            }
            else {
                System.out.printf("The area of %s is equal to %s.",this.getCode(),area.getCode());
            }
        }
        else {
            throw new Exception(String.format("The areas of these places cannot be compared"));
        }
    }


    // getter-setter methods
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

}
