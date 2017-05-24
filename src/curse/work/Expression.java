package curse.work;

public abstract class Expression{
    private double x0, y0;
    private double  xn;

    public Expression(double x0, double y0) {

        this.x0 = x0;
        this.y0 = y0;

    }

    public abstract double getFunction(double x, double y);


    public double getX0() {return x0;}


    public double getY0() {	return y0;}


    public void setX0(double x0) {	this.x0 = x0;}


    public void setY0(double y0) {	this.y0 = y0;}

    public double getXn() {	return xn;}

    public void setXn(double xn) {	this.xn = xn;}
}
