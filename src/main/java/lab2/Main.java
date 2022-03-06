package lab2;

import lab2.logariphmic.LnCalculator;
import lab2.logariphmic.LogBaseCalculator;
import lab2.trigonometric.CosCalculator;
import lab2.trigonometric.CosecCalculator;
import lab2.trigonometric.SecCalculator;
import lab2.trigonometric.SinCalculator;

import java.util.Locale;
import java.util.Map;
import java.util.function.UnaryOperator;

import static java.lang.Math.PI;
import static java.lang.String.format;

public class Main {
    public static void main(String[] args) {
        Map<Double, String> numbers = new java.util.HashMap<>(Map.of(
                2 * PI, "2 * PI,",
                PI, "PI,",
                2 * PI / 3, "2 * PI / 3,",
                PI / 2, "PI / 2,",
                PI / 4, "PI / 4,",
                0d, "0d,",
                -PI / 6, "-PI / 6,",
                -PI / 4, "-PI / 4,",
                -PI / 2, "-PI / 2,",
                -3 * PI / 4, "-3 * PI / 4,"
        ));
        numbers.putAll(Map.of(
                -PI, "-PI,",
                -4 * PI / 3, "-4 * PI / 3,",
                -2 * PI, "-2 * PI,"
        ));

        Map<String, UnaryOperator<Double>> functions = Map.of(
                "sin", Math::sin,
                "cos", Math::cos,
                "sec", (Double x) -> 1 / Math.cos(x),
                "cosec", (Double x) -> 1 / Math.sin(x),
                "ln", Math::log,
                "log2", (Double x) -> Math.log(x) / Math.log(2),
                "log3", (Double x) -> Math.log(x) / Math.log(2),
                "log5", (Double x) -> Math.log(x) / Math.log(2),
                "log10", Math::log10
        );

        functions.forEach((name, function) -> {
            System.out.println(name);
            System.out.println("MockChain.when(m)");
            numbers.forEach((x, s) -> {
                System.out.println(".mock(" + s + " " + format(Locale.US, "%.10f", function.apply(x)) + ")");
            });
            System.out.println();
        });

        final double ACCURACY = 0.0001;
        SinCalculator sin = new SinCalculator(ACCURACY);
        CosCalculator cos = new CosCalculator(ACCURACY, sin);
        SecCalculator sec = new SecCalculator(ACCURACY, cos);
        CosecCalculator cosec = new CosecCalculator(ACCURACY, sin);
        LnCalculator ln = new LnCalculator(ACCURACY);
        LogBaseCalculator log2 = new LogBaseCalculator(ACCURACY, 2, ln);
        LogBaseCalculator log5 = new LogBaseCalculator(ACCURACY, 5, ln);
        LogBaseCalculator log10 = new LogBaseCalculator(ACCURACY, 10, ln);
        LogBaseCalculator log3 = new LogBaseCalculator(ACCURACY, 3, ln);

        var function = new Function(ACCURACY, sin, cos, sec, cosec, ln, log2, log5, log10, log3);

        System.out.println("\nFunction test data (fake):");
        numbers.forEach((x, s) -> {
            System.out.println(function.calculate(x) + ", " + s.substring(0, s.length() - 1));
        });
    }
}
