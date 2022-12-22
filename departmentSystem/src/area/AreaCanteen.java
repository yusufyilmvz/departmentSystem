package area;

// AreaCanteen class extends Area
public class AreaCanteen extends Area{
    // Attribute(s)
    private int productNumberStockLimit; // Stock amount limit of the canteen
    // Constructors
    public AreaCanteen(String code, int capacity,int weight,int height){
        super(code,capacity,weight,height);
    }

    public AreaCanteen(String code, int capacity, int weight, int height, int productNumberStockLimit) {
        super(code, capacity, weight, height);
        this.productNumberStockLimit = productNumberStockLimit;
    }

    // Methods
    // Sells the product to consumer
    public void sellProduct(String product) {
        System.out.println(product + "is sold!");
    }

    // Getter(s) - setter(s)
    public int getProductNumberStockLimit() {
        return productNumberStockLimit;
    }

    public void setProductNumberStockLimit(int productNumberStockLimit) {
        this.productNumberStockLimit = productNumberStockLimit;
    }
}
