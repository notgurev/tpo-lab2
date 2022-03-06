package lab2;

import lab2.logariphmic.*;
import lab2.trigonometric.*;

public class Function extends Calculator {
    private final CosCalculator cos;
    private final TanCalculator tan;
    private final CosecCalculator cosec;
    private final LnCalculator ln;
    private final LogBaseCalculator log2;
    private final LogBaseCalculator log5;
    private final LogBaseCalculator log10;

    public Function(double accuracy, CosCalculator cos, TanCalculator tan,
                    CosecCalculator cosec, LnCalculator ln, LogBaseCalculator log2,
                    LogBaseCalculator log5, LogBaseCalculator log10) {
        super(accuracy);
        this.cos = cos;
        this.tan = tan;
        this.cosec = cosec;
        this.ln = ln;
        this.log2 = log2;
        this.log5 = log5;
        this.log10 = log10;

    }

    public double calculate(double x) {
        if (x <= 0) {
            return cosec.calculate(x) / tan.calculate(x) / cos.calculate(x);
        } else {
            return Math.pow(Math.pow(log10.calculate(x), 2) - ln.calculate(x), 3)
                    - Math.pow(log5.calculate(x) * (log5.calculate(x) / log2.calculate(x)), 2)
                    - ln.calculate(x);
        }
    }
}
