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
        if (Math.abs(x % Math.PI - 0.5) < accuracy) return Double.POSITIVE_INFINITY;

        double sec = 1 / cos.calculate(x);
        return Double.isFinite(sec) ? sec : Double.POSITIVE_INFINITY;
    }
}
