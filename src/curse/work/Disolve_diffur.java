package curse.work;

public class Disolve_diffur {


    private static double getK(Equation eq,double x, double y, double step){
        return step*eq.getFunction(x, y);
    }

    public static ResultEvaluation disolve(Equation eq, double step){
        double x_val[] = new double[(int)Math.abs((eq.getXn() - eq.getX0())/step*4)+1];
        double y_val[] = new double[x_val.length];

        double x, y,x0,y0, ysum, k, dy = 0;
        int count = 0, di = 0;
        x0 = x = eq.getX0();
        y0 = y = eq.getY0();

        while(x <= eq.getXn()){
            ysum = 0;

            for (int j = 0; j < 4; j++){
                if (x > eq.getXn()) break;
                k = getK(eq,x, y,step);

                x_val[count] = x;
                y_val[count++] = y;

                if (j == 1 || j == 2)
                    dy = k*2;
                else dy = k;
                if (j == 2){
                    x = x0 + step;
                    y = y0 + k;
                }else {
                    x = x0 + step/2;
                    y = y0 + k/2;
                }
                ysum += dy;

            }
            ysum /= 6;
            di++;
            x0 = eq.getX0()+ di*step;
            x = x0;
            y0 = y0 + ysum;
            y = y0;
            ysum = 0;
        }

        return new ResultEvaluation(x_val,y_val);
    }

}
