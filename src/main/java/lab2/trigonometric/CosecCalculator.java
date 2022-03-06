package lab2.trigonometric;

import lab2.Calculator;

public class CosecCalculator extends Calculator {
    private final SinCalculator sin;

    public CosecCalculator(double accuracy, SinCalculator sin) {
        super(accuracy);
        this.sin = sin;
    }

    public double calculate(double x) {
        double cosec = 1 / sin.calculate(x);
        return Double.isFinite(cosec) ? cosec : Double.POSITIVE_INFINITY;
    }
}
