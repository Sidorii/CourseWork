package curse.work;


public class Equation extends Expression{


    private Function function;
    private String name;
    private static int equationCount;

    public Equation(Function function, double x0, double y0, double xn) {
        super(x0,y0);
        this.function = function;
        setXn(xn);
        name = "No name function № " + equationCount++;
    }

    public Equation(String name,Function function, double x0, double y0, double xn) {
        this(function,x0,y0,xn);
        this.name = name;
    }


    public double getFunction(double x, double y){
        return function.evaluate(x,y);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "[x0 = " + getX0() + ", y0 = " + getY0() + ", xn = " + getXn() + "}";
    }
}
