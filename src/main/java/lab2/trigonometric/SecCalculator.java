package lab2.trigonometric;

import lab2.Calculator;

public class SecCalculator extends Calculator {
    private final CosCalculator cos;

    public SecCalculator(double accuracy, CosCalculator cos) {
        super(accuracy);
        this.cos = cos;
    }

    @Override
    public double calculate(double x) {
        double sec = 1 / cos.calculate(x);
        return Double.isFinite(sec) ? sec : Double.POSITIVE_INFINITY;
    }
}
