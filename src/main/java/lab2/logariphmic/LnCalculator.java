package lab2.logariphmic;

import lab2.Calculator;

public class LnCalculator extends Calculator {
    public static final int MAX_ITERATIONS = 1000000;

    public LnCalculator(double accuracy) {
        super(accuracy);
    }

    public double calculate(double x) {
        if (Double.isNaN(x) || x < 0.0) {
            return Double.NaN;
        } else if (x == Double.POSITIVE_INFINITY) {
            return Double.POSITIVE_INFINITY;
        } else if (x == 0.0) {
            return Double.NEGATIVE_INFINITY;
        }

        double current = 0;
        double prev;
        int iter = 1;

        if (Math.abs(x - 1) <= 1) {
            do {
                prev = current;
                current += ((Math.pow(-1, iter - 1) * Math.pow(x - 1, iter)) / iter);
                iter++;
            } while (accuracy <= Math.abs(current - prev) && iter < MAX_ITERATIONS);
//            return (current - prev) / 2; todo
        } else {
            do {
                prev = current;
                current += ((Math.pow(-1, iter - 1) * Math.pow(x - 1, -iter)) / iter);
                iter++;
            } while (accuracy <= Math.abs(current - prev) && iter < MAX_ITERATIONS);

            current += calculate(x - 1);
        }

        return current;
    }
}
