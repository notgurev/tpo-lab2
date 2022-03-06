package lab2;

import lab2.logariphmic.LnCalculator;
import lab2.logariphmic.LogBaseCalculator;
import lab2.trigonometric.CosCalculator;
import lab2.trigonometric.CosecCalculator;
import lab2.trigonometric.SecCalculator;
import lab2.trigonometric.SinCalculator;

public class Function extends Calculator {
    private final SinCalculator sin;
    private final CosCalculator cos;
    private final CosecCalculator cosec;
    private final SecCalculator sec;
    private final LnCalculator ln;
    private final LogBaseCalculator log2;
    private final LogBaseCalculator log5;
    private final LogBaseCalculator log10;
    private final LogBaseCalculator log3;

    public Function(double accuracy, SinCalculator sin, CosCalculator cos, SecCalculator sec,
                    CosecCalculator cosec, LnCalculator ln, LogBaseCalculator log2,
                    LogBaseCalculator log5, LogBaseCalculator log10, LogBaseCalculator log3) {
        super(accuracy);
        this.sin = sin;
        this.cos = cos;
        this.cosec = cosec;
        this.ln = ln;
        this.log2 = log2;
        this.log5 = log5;
        this.log10 = log10;
        this.sec = sec;
        this.log3 = log3;
    }

    public double calculate(double x) {
        if (x <= 0) {
            return squared(sec.calculate(x) / cosec.calculate(x) - cos.calculate(x) - sin.calculate(x) + squared(sec.calculate(x)));
        } else {
            return ((((log2.calculate(x) * ln.calculate(x)) + log3.calculate(x)) - log2.calculate(x))
                    + squared(log3.calculate(x))) + ((ln.calculate(x) + ((log10.calculate(x) + log10.calculate(x))
                    / (ln.calculate(x) / log10.calculate(x)))) / (ln.calculate(x) - log5.calculate(x)));
        }
    }

    private double squared(double x) {
        return Math.pow(x, 2);
    }
}
