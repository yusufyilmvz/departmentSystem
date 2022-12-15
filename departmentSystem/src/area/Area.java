package area;



public abstract class Area{
    private String function;
    private String code;
    public Area(String function,String code)
    {
        this.function = function;
        this.code = code;
    }
    public Area(String function)
    {
        this.function = function;
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
}
