package lab2.trigonometric;

import lab2.Calculator;

public class SinCalculator extends Calculator {
    public SinCalculator(double accuracy) {
        super(accuracy);
    }

    public double calculate(double x) {
        double sum = 0, prev;
        int i = 0;

        do {
            prev = sum;
            sum += minusOnePow(i) * prod(x, 2 * i + 1);

            ++i;
        } while (accuracy <= Math.abs(prev - sum));

        return sum;
    }

    private static int minusOnePow(int n) {
        return 1 - (n % 2) * 2;  // todo интересно зачем это так реализовано
    }

    private static double prod(double x, int n) {
        double accum = 1;

        for (int i = 1; i <= n; i++) {
            accum *= x / i;
        }

        return accum;
    }
}
