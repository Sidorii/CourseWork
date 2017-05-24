package curse.work;


import java.io.PrintWriter;

public class Main {


    private static final  PrintWriter WRITER = new PrintWriter(System.out, true);
    public static void main(String[] args) {

        Function function1 = new Function() {
            @Override
            public double evaluate(double x, double y) {
                return (0.8*Math.pow(x, 2) + 0.2*x*y);
            }
        };

        Equation e = new Equation(function1,0, 0.4, 1.6);



        ResultEvaluation resultEvaluation = Disolve_diffur.disolve(e,0.1);

        WRITER.println("The spreadshirt of root for " + e.getName() + " :");
        logResult(resultEvaluation);

        WRITER.close();
    }

    public static void logResult(ResultEvaluation resultEvaluation){

        double x[] = resultEvaluation.getX_val();
        double y[] = resultEvaluation.getY_val();


        for (int i = 0; i < x.length;i++){
            WRITER.print("\tx = ");
            WRITER.printf("%.2f", x[i]);
            WRITER.print(" and y = ");
            WRITER.printf("%.4f\n", y[i]);
        }
    }

}