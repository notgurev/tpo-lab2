package lab2.trigonometric;

import lab2.Calculator;

public class CosCalculator extends Calculator {
    private final SinCalculator sin;

    public CosCalculator(double accuracy, SinCalculator sin) {
        super(accuracy);
        this.sin = sin;
    }

    public double calculate(double x) {
        int fl = 1;
        for (int k = 0; k < 3; k++) {
            if ((x > Math.PI / 2) & (x < 3 * Math.PI / 2)) {
                fl = -1;
                break;
            }
        }
        for (int k = 0; k < 3; k++) {
            if ((x < -Math.PI / 2) & (x > -3 * Math.PI / 2)) {
                fl = -1;
                break;
            }
        }

        return fl * Math.sqrt(1 - sin.calculate(x) * sin.calculate(x));
    }
}