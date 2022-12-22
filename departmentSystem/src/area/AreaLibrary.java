package area;

// AreaLibrary class extends Area
public class AreaLibrary extends Area{
    // Attribute(s)
    private int bookCapacity; // Book capacity of the library

    //Constructors
    public AreaLibrary(String code, int capacity,int weight,int height) {
        super(code, capacity,weight,height);
    }

    public AreaLibrary(String code, int capacity, int weight, int height, int bookCapacity) {
        super(code, capacity, weight, height);
        this.bookCapacity = bookCapacity;
    }

    // Getter(s) - setter(s)
    public int getBookCapacity() {
        return bookCapacity;
    }

    public void setBookCapacity(int bookCapacity) {
        this.bookCapacity = bookCapacity;
    }
}
