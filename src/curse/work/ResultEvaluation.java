package curse.work;


public class ResultEvaluation {

    private double x_val[];
    private double y_val[];

    public ResultEvaluation(double[]x, double y[]){
        x_val = x;
        y_val = y;
    }


    public double[] getX_val() {
        return x_val;
    }

    public double[] getY_val() {
        return y_val;
    }
}
