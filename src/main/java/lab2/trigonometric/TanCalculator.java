package lab2.trigonometric;

import lab2.Calculator;

public class TanCalculator extends Calculator {
    private final SinCalculator sin;
    private final CosCalculator cos;

    public TanCalculator(double accuracy, SinCalculator sin, CosCalculator cos) {
        super(accuracy);
        this.sin = sin;
        this.cos = cos;
    }

    public double calculate(double x) {
        double tan = sin.calculate(x) / cos.calculate(x);
        return Double.isFinite(tan) ? tan : Double.POSITIVE_INFINITY; // todo зачем такая проверка
    }
}
